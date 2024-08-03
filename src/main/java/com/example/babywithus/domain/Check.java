package com.example.babywithus.domain;

import jakarta.persistence.*;

@Entity
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "check_id")
    Long id;

    String name;
}
