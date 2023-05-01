package com.secondhandmarket.secondhandmarket.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(originPatterns = "http://localhost:3000") // 3000포트에 대해서 허용하겠다.
@RestController  // 해당 클래스를 controller 레이어로 인식하게 한다. Rest한 형태로 controller를 제작할 예정
// RestController 어노테이션은 @Controller + @ResponseBody가 합쳐진 형태, 데이터를 직접 보내는 형태
@RequestMapping("/") // @RequestMapping("URL패턴") - request의 url 패턴을 보고 해당하는 패턴이 왔을 때 해당 클래스를 실행
public class MainController {

    @GetMapping("")
    public String hello(){
        return "Connection Successful";
    }

}
