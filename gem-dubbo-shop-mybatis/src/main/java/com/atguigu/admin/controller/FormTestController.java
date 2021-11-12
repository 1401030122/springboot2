package com.atguigu.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormTestController {
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("password") String password){
        return "main";
    }
}
