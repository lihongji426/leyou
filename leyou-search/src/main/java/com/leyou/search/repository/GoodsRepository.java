package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
