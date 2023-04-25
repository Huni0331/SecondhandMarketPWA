package com.secondhandmarket.secondhandmarket.controller;

import com.secondhandmarket.secondhandmarket.dto.ResponseDto;
import com.secondhandmarket.secondhandmarket.dto.SignUpDto;
import com.secondhandmarket.secondhandmarket.dto.SignUpResponseDto;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signUp")
    public ResponseDto<SignUpResponseDto> signUp(@RequestBody SignUpDto requestBody) {
        System.out.println(requestBody.toString());
        return null;
    }
    // ResponseDto에서 회원가입 성공과 실패를 가른다.
    // 성공과 실패를 가르기 위해 데이터를 받아와야 하는데 signUp이라는 변수에 request요청으로 email, password(SignUpDto)등의 값을 받아온다.
    // 요청에 성공하면 SignUpResponseDto에서의 토큰과 만료기간을 주고 실패면 fail

    // SignUpResponseDto => token, exprTime
    // ResponseDto => result, message, D data
    // SignUpDto => userEmail, ... 등

}
