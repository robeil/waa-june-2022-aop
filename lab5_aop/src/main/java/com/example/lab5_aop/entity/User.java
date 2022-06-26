package com.example.lab5_aop.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @JsonManagedReference
    @OneToMany (mappedBy = "user")
    private List<Review> reviews;

    @OneToMany (mappedBy = "user")
    @JsonManagedReference
    private List<Product> products;

    @JsonBackReference
    @OneToOne (mappedBy = "user")
    private Address address;


}
