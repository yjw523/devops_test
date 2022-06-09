package kr.re.kitri.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String home() {
        return "Hello World.. ㅇㅏㄴ녕하세요.. 반갑습니다.";
    }

    @GetMapping("home")
    public String homeAgain() {
        return "Hello World.. Again..sss";
    }
}
