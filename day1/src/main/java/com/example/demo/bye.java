package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class bye {
    @GetMapping("/bye")
    public String bye(){
        return "bye bye";
    }
}
    