package top.jiangyixin.eshop.auth.service.impl;

import org.springframework.stereotype.Service;
import top.jiangyixin.eshop.auth.dao.PriorityDAO;
import top.jiangyixin.eshop.auth.pojo.domain.Priority;
import top.jiangyixin.eshop.auth.pojo.dto.PriorityDTO;
import top.jiangyixin.eshop.auth.service.PriorityService;
import top.jiangyixin.eshop.common.util.BeanCopierUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author jiangyixin
 * @date 2020/10/12 下午9:29
 */
@Service
public class PriorityServiceImpl implements PriorityService {

    @Resource
    private PriorityDAO priorityDAO;

    @Override
    public List<PriorityDTO> listRootPriority() {
        List<Priority> priorities = priorityDAO.listRootPriority();
        return BeanCopierUtils.cloneList(priorities, PriorityDTO.class);
    }
}
