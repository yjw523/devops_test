package kr.re.kitri.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String home() {
        return "Hello World.. Again";
    }
}
