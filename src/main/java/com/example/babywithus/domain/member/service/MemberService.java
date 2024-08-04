package com.example.babywithus.domain.member.service;


import com.example.babywithus.domain.member.Member;
import com.example.babywithus.domain.member.Role;
import com.example.babywithus.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;

    public Long createMember(String name, Role role){
        Member member=new Member();
        member.setName(name);
        member.setRole(role);
        return memberRepository.save(member).getId();
    }


}
