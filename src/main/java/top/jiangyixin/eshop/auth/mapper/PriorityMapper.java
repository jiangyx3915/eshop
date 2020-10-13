package top.jiangyixin.eshop.auth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.jiangyixin.eshop.auth.pojo.domain.Priority;

import java.util.List;

/**
 * 权限管理模块Mapper组件
 *
 * @author jiangyixin
 * @date 2020/10/12 下午8:25
 */
@Mapper
public interface PriorityMapper {

    /**
     * 列出根节点权限
     * @return      根节点权限列表
     */
    @Select("SELECT " +
            "id, code, url, priority_comment, priority_type, parent_id, gmt_create, gmt_modified " +
            "FROM auth_priority " +
            "WHERE parent_id IS NULL;")
    List<Priority> listRootPriority();
}
