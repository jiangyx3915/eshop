package top.jiangyixin.eshop.logistics.service;

import top.jiangyixin.eshop.goods.dto.GoodsSkuDTO;

/**
 * 物流中心对外提供的接口
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:39
 */
public interface LogisticsFacadeService {
    /**
     * 计算商品sku的运费
     * @param goodsSkuDTO 商品sku DTO
     * @return 商品sku的运费
     */
    Double calculateFreight(GoodsSkuDTO goodsSkuDTO);
}
