package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @GetMapping("/getData")
    public String getData()
    {

       return "";
    }
}
