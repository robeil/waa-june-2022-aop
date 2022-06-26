package com.example.lab5_aop.service;

import com.example.lab5_aop.dto.CategoryDto;
import com.example.lab5_aop.dto.ProductDto;
import com.example.lab5_aop.entity.Category;
import com.example.lab5_aop.entity.Product;
import com.example.lab5_aop.repository.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class CategoryServiceImpl {


    @Autowired
    private CategoryRepo categoryRep;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAllCategoryLessThanMaxPrice(String category1, double maxPrice) {

        List<ProductDto> categories = new ArrayList<>();
        var product = categoryRep.findAll();

        for (Category category : product) {
            if (category.getName().equals(category1)) {
                for (Product cat : category.getProducts()) {
                    if (cat.getPrice() < maxPrice) {
                        var dto = modelMapper.map(cat, ProductDto.class);
                        categories.add(dto);
                    }
                }
            }
        }
        return categories;
    }

    @Override
    public List<CategoryDto> findAllCategories() {

        List<CategoryDto> categoryDtos = new ArrayList<>();
        var cagtagory = categoryRep.findAll();

        for(Category car : cagtagory){
            categoryDtos.add(modelMapper.map(car, CategoryDto.class));
        }
        return categoryDtos;
    }
}
