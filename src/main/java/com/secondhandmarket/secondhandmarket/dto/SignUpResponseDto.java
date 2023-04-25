package com.secondhandmarket.secondhandmarket.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpResponseDto {
    private String token;
    private int exprTime; //만료기한
}
