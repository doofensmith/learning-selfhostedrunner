package com.learning.jpaspec.util;

import com.learning.jpaspec.domain.common.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ResponseUtil {
    public static ResponseEntity<Object> build(HttpStatus httpStatus, String message, Object data) {
        return new ResponseEntity<>(ApiResponse.builder()
                .timestamp(LocalDateTime.now())
                .responseCode(httpStatus.value())
                .message(message)
                .data(data)
                .build(), httpStatus);
    }
}
