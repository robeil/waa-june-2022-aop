package com.example.lab5_aop.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
