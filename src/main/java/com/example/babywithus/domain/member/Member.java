package com.example.babywithus.domain.member;

import com.example.babywithus.domain.diary.Diary;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    Long id;

    @OneToMany(mappedBy = "member")
    private final List<Diary> diaries=new ArrayList<>();


}
