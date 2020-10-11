package top.jiangyixin.eshop.finance.service;

import top.jiangyixin.eshop.wms.dto.PurchaseInputOrderDTO;
import top.jiangyixin.eshop.wms.dto.ReturnGoodsInputOrderDTO;
import top.jiangyixin.eshop.wms.dto.SaleDeliveryOrderDTO;

/**
 * 财务中心对外提供的接口
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:42
 */
public interface FinanceFacadeService {

    /**
     * 创建采购结算单
     * @param purchaseInputOrderDTO 采购入库单DTO
     * @return 处理结果
     */
    Boolean createPurchaseSettlementOrder(
            PurchaseInputOrderDTO purchaseInputOrderDTO);

    /**
     * 给物流公司打款
     * @param saleDeliveryOrderDTO 销售出库单
     * @return 处理结果
     */
    Boolean payForLogisticsCompany(
            SaleDeliveryOrderDTO saleDeliveryOrderDTO);

    /**
     * 执行退货退款操作
     * @param returnGoodsInputOrderDTO 退货入库单DTO
     * @return 处理结果
     */
    Boolean executeReturnGoodsRefund(
            ReturnGoodsInputOrderDTO returnGoodsInputOrderDTO);
}
