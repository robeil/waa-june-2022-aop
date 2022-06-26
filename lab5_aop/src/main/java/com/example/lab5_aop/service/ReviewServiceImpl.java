package com.example.lab5_aop.service;

import com.example.lab5_aop.dto.ReviewDto;
import com.example.lab5_aop.entity.Product;
import com.example.lab5_aop.entity.Review;
import com.example.lab5_aop.entity.User;
import com.example.lab5_aop.repository.ProductRepo;
import com.example.lab5_aop.repository.ReviewRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ReviewServiceImpl  {

    @Autowired
    private

    ProductRepo productRepo;
    @Autowired
    private
    ReviewRepo reviewRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ReviewDto> findAllReviewOfProduct(long id) {

        List<ReviewDto> reviewDtos = new ArrayList<>();
        var prod =  productRepo.findAll();

        for (Product product : prod) {
            if (product.getId() == id) {
                User user = product.getUser();
                var reviews = user.getReviews();
                for (Review review : reviews) {
                    var dto = modelMapper.map(review, ReviewDto.class);
                    reviewDtos.add(dto);
                }
            }
        }
        return reviewDtos;
    }

    @Override
    public List<ReviewDto> fiindAllReviews() {

        List<ReviewDto> reviewDtos = new ArrayList<>();
        var rev =  reviewRepo.findAll();

        for(Review review: rev){
            var dto = modelMapper.map(review,ReviewDto.class);
        }
        return reviewDtos;
    }
}
