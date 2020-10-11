package top.jiangyixin.eshop.goods.service;

import top.jiangyixin.eshop.goods.dto.GoodsSkuDTO;

/**
 * 商品中心对外提供的接口
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:12
 */
public interface GoodsFacadeService {

    /**
     * 根据ID查询商品sku
     * @param goodsSkuId    商品sku id
     * @return              商品sku DTO
     */
    GoodsSkuDTO getGoodsSkuById(Long goodsSkuId);
}
