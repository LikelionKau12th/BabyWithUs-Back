package com.example.babywithus.domain.member.service;

import com.example.babywithus.domain.member.Member;
import com.example.babywithus.domain.member.dto.CustomMemberDetails;
import com.example.babywithus.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomMemberDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = memberRepository.findByName(username);

        if(member != null){
            return new CustomMemberDetails(member);
        }

        return null;
    }
}
