package com.example.babywithus.global.common.dto.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessType {

    /**
     * 200 OK
     */
    PROCESS_SUCCESS(HttpStatus.OK, "OK"),
    PROCESS_SUCCESSED(HttpStatus.CREATED, "요청이 성공했습니다."),
    LOGIN_SUCCESS(HttpStatus.OK, "로그인에 성공했습니다."),
    REISSUE_SUCCESS(HttpStatus.OK, "Access 토큰 재발급에 성공했습니다."),
    LOGOUT_SUCCESS(HttpStatus.OK, "로그아웃에 성공했습니다."),
    KAKAO_ACCESS_TOKEN_SUCCESS(HttpStatus.OK, "카카오 엑세스 토큰을 가져오는데 성공했습니다."),
    ;




    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
