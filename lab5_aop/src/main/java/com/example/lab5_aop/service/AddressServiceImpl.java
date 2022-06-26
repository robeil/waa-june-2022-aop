package com.example.lab5_aop.service;


import com.example.lab5_aop.dto.AddressDto;
import com.example.lab5_aop.entity.Address;
import com.example.lab5_aop.repository.AddressRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl  {


    @Autowired
    private AddressRepo address;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAllQddresse() {

        List<AddressDto> addressDtos = new ArrayList<>();
        var aa = address.findAll();

        for(Address aaa: aa){
            addressDtos.add(modelMapper.map(aaa,AddressDto.class));
        }
        return addressDtos;
    }
}
