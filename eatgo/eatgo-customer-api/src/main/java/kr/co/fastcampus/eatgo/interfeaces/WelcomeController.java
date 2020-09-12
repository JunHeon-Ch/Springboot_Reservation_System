package kr.co.fastcampus.eatgo.interfeaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String hello(){
        return "Hello World!!!";
    }
}
