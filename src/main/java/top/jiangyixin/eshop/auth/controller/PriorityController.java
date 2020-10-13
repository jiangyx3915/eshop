package top.jiangyixin.eshop.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jiangyixin.eshop.auth.pojo.dto.PriorityDTO;
import top.jiangyixin.eshop.auth.pojo.vo.PriorityVO;
import top.jiangyixin.eshop.auth.service.PriorityService;
import top.jiangyixin.eshop.common.util.BeanCopierUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author jiangyixin
 * @date 2020/10/12 下午9:31
 */
@RestController
@RequestMapping("/auth")
public class PriorityController {

    @Resource
    private PriorityService priorityService;

    /**
     * 列出根节点权限
     * @return      根节点权限列表
     */
    @GetMapping("/priority/root")
    public List<PriorityVO> listRootPriorities() {
        List<PriorityDTO> priorityDTOList = priorityService.listRootPriority();

        return BeanCopierUtils.cloneList(priorityDTOList, PriorityVO.class);
    }
}
