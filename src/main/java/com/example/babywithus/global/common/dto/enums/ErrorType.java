package com.example.babywithus.global.common.dto.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorType {

    /**
     * 400 BAD REQUEST
     */
    // 표준 오류
    REQUEST_VALIDATION_ERROR(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    INVALID_TYPE_ERROR(HttpStatus.BAD_REQUEST, "잘못된 타입이 입력되었습니다."),
    INVALID_MISSING_HEADER_ERROR(HttpStatus.BAD_REQUEST, "요청에 필요한 헤더값이 존재하지 않습니다."),
    INVALID_HTTP_REQUEST_ERROR(HttpStatus.BAD_REQUEST, "요청 형식이 허용된 형식과 다릅니다."),
    INVALID_HTTP_METHOD_ERROR(HttpStatus.BAD_REQUEST, "지원되지 않는 HTTP method 요청입니다."),
    INVALID_TOKEN_HEADER_ERROR(HttpStatus.BAD_REQUEST, "토큰 헤더값의 형식이 잘못되었습니다."),
    INVALID_CODE_HEADER_ERROR(HttpStatus.BAD_REQUEST, "code 헤더값의 형식이 잘못되었습니다."),
    // 인증 관련 오류
    EMPTY_PRINCIPLE_ERROR(HttpStatus.BAD_REQUEST, "Principle 객체가 없습니다. (null)"),

    /**
     * 401 UNAUTHORIZED
     */
    INVALID_JWT_TOKEN(HttpStatus.UNAUTHORIZED, "유효하지 않는 JWT 토큰입니다."),
    EXPIRED_JWT_TOKEN(HttpStatus.UNAUTHORIZED, "만료된 JWT 토큰입니다."),
    UNSUPPORTED_JWT_TOKEN(HttpStatus.UNAUTHORIZED, "지원하지 않는 JWT 토큰입니다."),
    EMPTY_JWT_TOKEN(HttpStatus.UNAUTHORIZED, "JWT 토큰이 존재하지 않습니다."),
    INVALID_JWT_SIGNATURE(HttpStatus.UNAUTHORIZED, "잘못된 JWT 서명입니다."),
    UNKNOWN_JWT_ERROR(HttpStatus.UNAUTHORIZED, "알 수 없는 JWT 토큰 오류가 발생했습니다."),

    INVALID_SOCIAL_ACCESS_TOKEN(HttpStatus.UNAUTHORIZED, "유효하지 않은 소셜 엑세스 토큰입니다."),
    INVALID_REFRESH_TOKEN(HttpStatus.UNAUTHORIZED, "유효하지 않은 리프레시 토큰입니다, 다시 로그인을 해주세요."),

    /**
     * 404 NOT FOUND
     */
    NOT_FOUND_MEMBER_ERROR(HttpStatus.NOT_FOUND, "존재하지 않는 회원입니다."),
    ADVICE_NOT_FOUND(HttpStatus.NOT_FOUND, "요청하신 Diary에 맞는 Advice가 없습니다."),
    NOT_FOUND_REFRESH_TOKEN_ERROR(HttpStatus.NOT_FOUND, "존재하지 않는 리프레시 토큰입니다."),
    NOT_YOUR_DIARY(HttpStatus.NOT_FOUND,"해당 Diary에 접근할 수 있는 권한이 없습니다."),
    NO_DIARY(HttpStatus.NOT_FOUND,"해당 Id에 맞는 Diary가 존재하지 않습니다."),
    NOT_FOUND_PAYMENT(HttpStatus.NOT_FOUND,"결제 정보를 찾을 수 없습니다."),

    /**
     * 500 INTERNAL SERVER ERROR
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 오류"),
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
