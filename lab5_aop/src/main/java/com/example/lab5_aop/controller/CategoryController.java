package com.example.lab5_aop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAllCategoryDtos(){
        return categoryService.findAllCategories();
    }

//    @GetMapping
//    public List<ProductDto> findAllCategoryGreaterThanMaxPrice1(@RequestParam String category,@RequestParam double maxPrice){
//       return categoryService.findAllCategoryLessThanMaxPrice(category, maxPrice);
//    }

//    //TODO ------
//    @GetMapping("/{maxPrice}")
//    public List<ProductDto> findAllCategoriesLessThanMaxPrice( String cat, @RequestParam double maxPrice) {
//        return categoryService.findAllCategoryLessThanMaxPrice(cat, maxPrice);
//    }
}
