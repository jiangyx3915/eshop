package top.jiangyixin.eshop.wms.dto;

import lombok.Data;

import java.util.Date;

/**
 * 采购入库单DTO
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:25
 */
@Data
public class PurchaseInputOrderDTO {

    /**
     * id
     */
    private Long id;
    /**
     * 供应商id
     */
    private Long supplierId;
    /**
     * 预期到达时间
     */
    private Date expectArrivalTime;
    /**
     * 实际到达时间
     */
    private Date arrivalTime;
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
     * 采购入库单备注
     */
    private String purchaseInputOrderComment;
    /**
     * 采购员
     */
    private String purchaser;
    /**
     * 采购入库单的状态
     */
    private Integer purchaseInputOrderStatus;
    /**
     * 采购入库单的创建时间
     */
    private Date gmtCreate;
    /**
     * 采购入库单的修改时间
     */
    private Date gmtModified;
}
