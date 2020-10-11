package top.jiangyixin.eshop.purchase.service;

/**
 * 采购中心对外提供的接口
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:19
 */
public interface PurchaseFacadeService {

    /**
     * 判断是否有关联商品sku的采购单
     * @param goodsSkuId 商品sku id
     * @return 是否有采购单关联了商品sku
     */
    Boolean existRelatedPurchaseOrder(Long goodsSkuId);

    /**
     * 通知采购中心，“创建采购入库单”事件发生了
     * @param purcaseOrderId 采购单id
     * @return 处理结果
     */
    Boolean informCreatePurchaseInputOrderEvent(Long purcaseOrderId);

    /**
     * 通知采购中心，“完成采购入库单”事件发生了
     * @param purcaseOrderId 采购单id
     * @return 处理结果
     */
    Boolean informFinishPurchaseInputOrderEvent(Long purcaseOrderId);

    /**
     * 通知采购中心，“创建采购结算单”事件发生了
     * @param purchaseOrderId 采购单id
     * @return 处理结果
     */
    Boolean informCreatePurchaseSettlementOrderEvent(Long purchaseOrderId);

    /**
     * 通知采购中心，“完成采购结算单”事件发生了
     * @param purchaseOrderId 采购单id
     * @return 处理结果
     */
    Boolean informFinishPurchaseSettlementOrderEvent(Long purchaseOrderId);

}
