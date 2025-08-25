package com.example.jpaonetoone.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(unique = true)
    private String email;
    private String password;

}
