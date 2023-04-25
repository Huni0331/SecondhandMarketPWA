package com.secondhandmarket.secondhandmarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "set")
public class ResponseDto<D> {
    //response 형태 -> result, message, token
    private boolean result;
    private String message; // 결과의 대한 메세 (signUp이 성공하면 성공했다. 중복되면 중복됐다. 등)
    private D data; // 실제 데이터는 이 D object에 담아서 보내준다.


    //회원가입에 성공했을 때
    public static <D> ResponseDto<D> setSuccess(String message, D data) {
        //return new ResponseDto<D>(true, message, data);
        //하지만 위에 staticName = "set"으로 지정했기 때문에 밑에 처럼 작성할 수 있다.
        System.out.println(data.toString());
        return ResponseDto.set(true, message, data);
    }

    //회원가입에 실패했을 때
    public static <D> ResponseDto<D> setFailed(String message) {
        return ResponseDto.set(false, message, null);
    }
}
