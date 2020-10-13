package top.jiangyixin.eshop.common.util;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.beans.BeanCopier;

import java.util.*;

/**
 * BeanCopier工具类
 *
 * @author jiangyixin
 * @date 2020/10/13 下午8:27
 */
@Slf4j
public class BeanCopierUtils {

    /**
     * BeanCopier缓存
     */
    public static Map<String, BeanCopier> beanCopierCacheMap = new HashMap<>();

    /**
     * 将source对象中的属性拷贝到target对象中去
     * @param source    source对象
     * @param target    target对象
     */
    public static void copyProperties(Object source, Object target) {
        String cacheKey = source.getClass().toString() + target.getClass().toString();
        BeanCopier beanCopier;
        if (!beanCopierCacheMap.containsKey(cacheKey)) {
            beanCopier = BeanCopier.create(source.getClass(), target.getClass(), false);
            beanCopierCacheMap.put(cacheKey, beanCopier);
        } else {
            beanCopier = beanCopierCacheMap.get(cacheKey);
        }
        beanCopier.copy(source, target, null);
    }

    /**
     * 复制类的属性
     * @param source    source对象
     * @param clazz     target类
     * @return          target对象
     */
    public static <T> T clone(Object source, Class<T> clazz) {
        T target = null;
        try {
            target = clazz.newInstance();
        } catch (Exception e) {
            log.error("Copy properties时出错 {}", e.toString());
        }
        copyProperties(source, Objects.requireNonNull(target));
        return target;
    }

    /**
     * 复制列表
     * @param array     source列表对象
     * @param clazz     target类
     * @return          target列表对象
     */
    public static <T> List<T> cloneList(List<?> array , Class<T> clazz) {
        List<T> target = new ArrayList<>(array.size());

        for (Object obj :
                array) {
            target.add(clone(obj, clazz));
        }
        return target;
    }
}
