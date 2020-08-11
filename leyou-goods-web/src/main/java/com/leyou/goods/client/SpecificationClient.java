package com.leyou.goods.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {
}
