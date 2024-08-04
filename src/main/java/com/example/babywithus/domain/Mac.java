package com.example.babywithus.domain;

import jakarta.persistence.*;

@Entity
public class Mac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    Long id;
}
