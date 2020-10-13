package top.jiangyixin.eshop.auth.service;

import top.jiangyixin.eshop.auth.pojo.dto.PriorityDTO;

import java.util.List;

/**
 *
 * 权限管理模块 service 组件
 * @author jiangyixin
 */
public interface PriorityService {

    /**
     * 列出根节点权限
     * @return      根节点权限列表
     */
    List<PriorityDTO> listRootPriority();
}
