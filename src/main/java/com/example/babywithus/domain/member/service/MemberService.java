package com.example.babywithus.domain.member.service;


import com.example.babywithus.domain.member.Member;
import com.example.babywithus.domain.member.Role;
import com.example.babywithus.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void createMember(String name, String password,Role role){

        String username=name;
        String userPassword=password;

        Boolean isExist = memberRepository.existsByName(username);

        if(isExist){
            return ;
        }


        Member member=new Member();
        member.setName(name);
        member.setPassword(bCryptPasswordEncoder.encode(password));
        member.setPart("ROLE_ADMIN");
        member.setRole(role);

        memberRepository.save(member);

    }


}
