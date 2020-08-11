package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.bo.SpuBo;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface GoodsService {
    /**
     * 根据条件分页查询spu
     *
     * @param key
     * @param saleable
     * @param page
     * @param rows
     * @return
     */
    PageResult<SpuBo> querySpuByPage(String key, Boolean saleable, Integer page, Integer rows);

    /**
     * 新增商品
     *
     * @param spuBo
     */
    void saveGoods(SpuBo spuBo);

    /**
     * 根据spuId查询SpuDetail
     *
     * @param spuId
     * @return
     */
    SpuDetail querySpuDetailBySpuId(Long spuId);

    /**
     * 根据spuId查询sku集合
     *
     * @param spuId
     * @return
     */
    List<Sku> querySkusBySpuId(Long spuId);

    /**
     * 更新商品信息
     *
     * @param spuBo
     */
    void updateGoods(SpuBo spuBo);

    /**
     * 根据id查询spu
     * @param id
     * @return
     */
    Spu querySpuById(Long id);

    Sku querySkuBySkuId(Long skuId);
}
