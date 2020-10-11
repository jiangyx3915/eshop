package top.jiangyixin.eshop.goods.dto;

import lombok.Data;

import java.util.Date;

/**
 * 商品sku DTO
 *
 * @author jiangyixin
 * @date 2020/10/9 下午8:09
 */
@Data
public class GoodsSkuDTO {
    /**
     * 商品Id
     */
    private Long goodsId;
    /**
     * 商品sku编号
     */
    private String goodsSkuCode;
    /**
     * 采购价格
     */
    private Double purchasePrice;
    /**
     * 销售价格
     */
    private Double salePrice;
    /**
     * 折扣价格
     */
    private Double discountPrice;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
}
