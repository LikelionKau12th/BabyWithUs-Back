package com.example.babywithus.domain.member.repository;

import com.example.babywithus.domain.member.Member;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
