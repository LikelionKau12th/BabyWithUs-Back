package com.example.babywithus.domain.member.controller;

import com.example.babywithus.domain.member.dto.request.MemberCreateRequestDto;
import com.example.babywithus.domain.member.dto.response.MemberCreateResponseDto;
import com.example.babywithus.domain.member.service.MemberService;
import com.example.babywithus.global.common.dto.ApiResponse;
import com.example.babywithus.global.common.dto.enums.SuccessType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public ResponseEntity<ApiResponse<?>>create(@RequestBody MemberCreateRequestDto requestDto){


        memberService.createMember(requestDto.getName(),requestDto.getPassword(),requestDto.getRole());
        return ResponseEntity.ok().body(ApiResponse.success(SuccessType.PROCESS_SUCCESSED));



    }



}
