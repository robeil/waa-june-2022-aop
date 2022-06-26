package com.example.lab5_aop.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ReviewDto {

    private Long id;
    private String comment;
}
