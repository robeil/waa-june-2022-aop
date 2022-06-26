package com.example.lab5_aop.repository;

import com.example.lab5_aop.entity.Address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {

}
