package com.example.babywithus.domain.member.dto.request;


import com.example.babywithus.domain.member.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberCreateRequestDto {

    private String name;
    private String password;
    private Role role;
}
