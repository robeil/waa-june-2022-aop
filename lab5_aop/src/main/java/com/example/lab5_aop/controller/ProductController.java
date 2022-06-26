package com.example.lab5_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    public List<ProductDto> findAllCategories(){
        return productService.findAllCategories();
    }
    @GetMapping("/{minPrice}")
    public List<ProductDto> findAllProductGreaterMinPrice(@RequestParam double minPrice) {
        return productService.finalAllProductGreaterMinPrice(minPrice);
    }

    @GetMapping(path = "/{keyword}")
    public List<ProductDto> findByKeyWord(@PathVariable String keyWord) {
        return productService.findByKeyWord(keyWord);
    }
}
