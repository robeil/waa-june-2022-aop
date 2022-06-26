package com.example.lab5_aop.repository;

import com.example.lab5_aop.entity.Review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Long> {
}
