package com.example.lab5_aop.service;

import com.example.lab5_aop.dto.ProductDto;
import com.example.lab5_aop.dto.UserDto;
import com.example.lab5_aop.entity.Product;
import com.example.lab5_aop.entity.User;
import com.example.lab5_aop.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAllProductByCreatedByUser(long id) {

        List<ProductDto> productDtos = new ArrayList<>();
        var dtos = userRepo.findAll();

        for (User user : dtos) {
            if (user.getId() == id) {
                for (Product product : user.getProducts()) {
                    var dto = modelMapper.map(product, ProductDto.class);
                    productDtos.add(dto);
                }
            }
        }

        return productDtos;
    }

    @Override
    public List<UserDto> findAllUsers() {

        List<UserDto> userDtos = new ArrayList<>();
        var data= userRepo.findAll();
        for(User user: data){
            var u = modelMapper.map(user,UserDto.class);
            userDtos.add(u);
        }
        return userDtos;
    }

}
