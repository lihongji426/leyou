package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface BrandService {
    /**
     * 根据查询条件分页并排序查询品牌信息
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @return
     */
    PageResult<Brand> queryBrandByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc);

    /**
     * 新增品牌
     * @param brand
     * @param cids
     */
    void saveBrand(Brand brand, List<Long> cids);

    /**
     * 根据三级分类id查询品牌信息
     * @param cid
     * @return
     */
    List<Brand> queryBrandsByCid(Long cid);

    Brand queryBrandById(Long id);
}
