package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("helloBoot")
    public String helloBoot(){
        return "Hello Boot-JPA";
    }
}
