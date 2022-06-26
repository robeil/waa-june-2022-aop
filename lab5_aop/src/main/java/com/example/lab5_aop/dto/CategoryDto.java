package com.example.lab5_aop.dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CategoryDto {

    private long id;
    private String name;
}
