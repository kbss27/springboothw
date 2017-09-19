package com.example.hw.enums;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by daou on 2017-09-18.
 */
public enum HwResponse {
    SUCCESS(new ResponseEntity<>("성공", HttpStatus.OK)),
    FAILED(new ResponseEntity<>("잠시 후에 다시 시도해주세요", HttpStatus.INTERNAL_SERVER_ERROR));

    private final ResponseEntity<String> responseEntity;

    HwResponse(ResponseEntity<String> responseEntity) {
        this.responseEntity = responseEntity;
    }

    public ResponseEntity<String> result() {
        return this.responseEntity;
    }
}
