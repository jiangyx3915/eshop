package top.jiangyixin.eshop.customer.dto;

import lombok.Data;

import java.util.Date;

/**
 * 退货工单DTO
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:36
 */
@Data
public class ReturnGoodsWorksheetDTO {

    /**
     * id
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 退货工单的状态
     */
    private Integer returnGoodsWorkwheetStatus;
    /**
     * 退货原因
     */
    private String returnGoodsReason;
    /**
     * 退货备注
     */
    private String returnGoodsComment;
    /**
     * 退货物流单号
     */
    private String returnGoodsCourierNumber;
    /**
     * 退货工单的创建时间
     */
    private Date gmtCreate;
    /**
     * 退货工单的修改时间
     */
    private Date gmtModified;
}
