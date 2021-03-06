package top.jiangyixin.eshop.purchase.dto;

import lombok.Data;

import java.util.Date;

/**
 * 采购单DTO
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:29
 */
@Data
public class PurchaseOrderDTO {
    /**
     * id
     */
    private Long id;
    /**
     * 供应商id
     */
    private Long supplierId;
    /**
     * 预期到货时间
     */
    private Date expectArrivalTime;
    /**
     * 采购联系人
     */
    private String purchaseContactor;
    /**
     * 采购联系人电话号码
     */
    private String purchaseContactPhoneNumber;
    /**
     * 采购联系人邮箱地址
     */
    private String purchaseContactEmail;
    /**
     * 采购单备注
     */
    private String purchaseOrderComment;
    /**
     * 采购员
     */
    private String purchaser;
    /**
     * 采购单的状态
     */
    private Integer purchaseOrderStatus;
    /**
     * 采购单的创建时间
     */
    private Date gmtCreate;
    /**
     * 采购单的修改时间
     */
    private Date gmtModified;
}
