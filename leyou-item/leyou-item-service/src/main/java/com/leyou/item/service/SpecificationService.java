package com.leyou.item.service;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface SpecificationService {
    /**
     * 根据分类id查询参数组
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupsByCid(Long cid);

    /**
     * 根据条件查询规格参数
     * @param gid
     * @return
     */
    List<SpecParam> queryParams(Long gid, Long cid, Boolean generic, Boolean searching);

    /**
     * 根据cid查询组和下面的规格参数
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupsWithParam(Long cid);
}
