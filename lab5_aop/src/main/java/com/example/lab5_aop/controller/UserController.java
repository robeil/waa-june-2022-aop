package com.example.lab5_aop.controller;


import com.example.lab5_aop.dto.ProductDto;
import com.example.lab5_aop.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping(path = "/{id}")
    public List<ProductDto> findAllProductCreatedByUser(@PathVariable("id") long id) {
        return userService.findAllProductByCreatedByUser(id);
    }
}
