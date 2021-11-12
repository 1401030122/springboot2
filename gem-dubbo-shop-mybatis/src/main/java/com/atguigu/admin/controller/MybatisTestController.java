package com.atguigu.admin.controller;


import com.atguigu.admin.boom2.entity.Boom2;
import com.atguigu.admin.boom2.service.Boom2Service;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@Controller
public class MybatisTestController {

   @Autowired
    Boom2Service boom2Service;

   @ResponseBody
   @GetMapping("/boom")
    public Boom2 getBoom2(Long id){
       return boom2Service.getById(id);
   }
}
