package com.leyou.item.api;

import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
@RequestMapping("/brand")
public interface BrandApi {

    @GetMapping("/{id}")
    public Brand queryBrandById(@PathVariable("id") Long id);
}
