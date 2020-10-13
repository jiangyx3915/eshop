package top.jiangyixin.eshop.auth.dao;

import top.jiangyixin.eshop.auth.pojo.domain.Priority;

import java.util.List;

/**
 * 权限管理模块 DAO
 *
 * @author jiangyixin
 * @date 2020/10/12 下午9:24
 */
public interface PriorityDAO {

    /**
     * 列出根节点权限
     * @return      根节点权限列表
     */
    List<Priority> listRootPriority();
}
