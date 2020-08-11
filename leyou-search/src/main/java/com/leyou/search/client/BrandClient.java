package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
