package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface CategoryService {
    /**
     * 根据父节点的id查询子节点
     * @param pid
     * @return
     */
    List<Category> queryCategoriesByPid(Long pid);

    /**
     * 根据三级id获取分类名称
     */
    public List<String> queryNamesByIds(List<Long> ids);
}
