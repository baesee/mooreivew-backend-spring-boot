package com.billlog.mooreview.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin("*")
@RestController
//@RequestMapping("/moorv_test/api/v1/")
@RequestMapping("/api")
public class TestController {

    @PostMapping("/ip")
    public ResponseEntity<String> ip (HttpServletRequest request) {
        // 요청을 보낸 클라이언트의 IP주소를 반환합니다.
        return ResponseEntity.ok(request.getRemoteAddr());
    }

    @PostMapping("/str")
    public String str (HttpServletRequest request) {
        // 요청을 보낸 클라이언트의 IP주소를 반환합니다.
        return "[이 텍스트는 서버에서 보내는 텍스트 입니다.]";
    }



}
