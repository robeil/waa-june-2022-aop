package com.example.lab5_aop.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private int rating;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;
    @JsonManagedReference
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "products")
    private List<Review> reviews;

}
