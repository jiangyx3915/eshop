package top.jiangyixin.eshop.auth.pojo.domain;

import lombok.Data;
import top.jiangyixin.eshop.common.util.BeanCopierUtils;

import java.util.Date;
import java.util.Objects;

/**
 * 权限类
 *
 * @author jiangyixin
 * @date 2020/10/12 下午8:22
 */
@Data
public class Priority {
    /**
     * 权限id
     */
    private Long id;
    /**
     * 权限编号
     */
    private String code;
    /**
     * 权限URL
     */
    private String url;
    /**
     * 权限备注
     */
    private String priorityComment;
    /**
     * 权限类型
     */
    private Integer priorityType;
    /**
     * 父权限id
     */
    private Integer parentId;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
}
