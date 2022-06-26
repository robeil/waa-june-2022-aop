package com.example.lab5_aop.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AddressDto {

    private Long id;
    private String street;
    private int zip;
    private String city;
}
