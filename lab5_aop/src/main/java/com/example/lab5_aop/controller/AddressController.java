package com.example.lab5_aop.controller;

import com.example.lab5_aop.dto.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<AddressDto> findAllAdresses(){

        return addressService.findAllQddresse();
    }
}
