package top.jiangyixin.eshop.schedule.service;

import top.jiangyixin.eshop.customer.dto.ReturnGoodsWorksheetDTO;
import top.jiangyixin.eshop.order.dto.OrderDTO;
import top.jiangyixin.eshop.purchase.dto.PurchaseOrderDTO;
import top.jiangyixin.eshop.wms.dto.PurchaseInputOrderDTO;
import top.jiangyixin.eshop.wms.dto.ReturnGoodsInputOrderDTO;

/**
 * 调度中心对外提供的接口
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:33
 */
public interface ScheduleFacadeService {
    /**
     * 通知库存中心，“采购入库完成”事件发生了
     * @param purchaseInputOrderDTO 采购入库单DTO
     * @return 处理结果
     */
    Boolean informPurchaseInputFinished(
            PurchaseInputOrderDTO purchaseInputOrderDTO);

    /**
     * 通知库存中心，“提交订单”事件发生了
     * @param orderDTO 订单DTO
     * @return 处理结果
     */
    Boolean informSubmitOrderEvent(OrderDTO orderDTO);

    /**
     * 通知库存中心，“支付订单”事件发生了
     * @param orderDTO 订单DTO
     * @return 处理结果
     */
    Boolean informPayOrderEvent(OrderDTO orderDTO);

    /**
     * 通知库存中心，“取消订单”事件发生了
     * @param orderDTO 订单DTO
     * @return 处理结果
     */
    Boolean informCancelOrderEvent(OrderDTO orderDTO);

    /**
     * 通知库存中心，“完成退货入库”事件发生了
     * @param returnGoodsInputOrderDTO 退货入库单DTO
     * @return 处理结果
     */
    Boolean informReturnGoodsInputFinished(
            ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO);

    /**
     * 调度采购入库
     * @param purchaseOrderDTO 采购单DTO
     * @return 处理结果
     */
    Boolean schedulePurchaseInput(PurchaseOrderDTO purchaseOrderDTO);

    /**
     * 调度销售出库
     * @param orderDTO 订单DTO
     * @return 处理结果
     */
    Boolean scheduleSaleDelivery(OrderDTO orderDTO);

    /**
     * 调度退货入库
     * @param orderDTO 订单DTO
     * @param returnGoodsWorksheetDTO 退货工单DTO
     * @return 处理结果
     */
    Boolean scheduleReturnGoodsInput(OrderDTO orderDTO,
                                     ReturnGoodsWorksheetDTO returnGoodsWorksheetDTO);

}
