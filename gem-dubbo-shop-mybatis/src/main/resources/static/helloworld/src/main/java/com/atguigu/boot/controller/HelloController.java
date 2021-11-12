package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/car")
    Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(@RequestParam(value = "name") String zhaojie){
        return "Hello,Spring boot2:"+zhaojie;
    }
}
