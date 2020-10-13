package top.jiangyixin.eshop.auth.dao.impl;

import org.springframework.stereotype.Repository;
import top.jiangyixin.eshop.auth.dao.PriorityDAO;
import top.jiangyixin.eshop.auth.pojo.domain.Priority;
import top.jiangyixin.eshop.auth.mapper.PriorityMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限管理模块 DAO 组件
 *
 * @author jiangyixin
 * @date 2020/10/12 下午9:24
 */
@Repository
public class PriorityDAOImpl implements PriorityDAO {

    @Resource
    private PriorityMapper priorityMapper;


    @Override
    public List<Priority> listRootPriority() {
        return priorityMapper.listRootPriority();
    }
}
