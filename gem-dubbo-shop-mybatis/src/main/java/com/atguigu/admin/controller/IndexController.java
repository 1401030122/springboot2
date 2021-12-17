package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Score;
import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.imp.ScoreServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class IndexController {
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @RequestMapping ("/login")
    public String login(User user, HttpSession session){

            return "redirect:/main.html";


    }



    @RequestMapping("/main.html")
    public String mainPage(){
        return "main";
    }

    @Autowired
    ScoreServiceImp scoreService;

    @ResponseBody
    @GetMapping("/acct")
    public Score getById(@RequestParam("id") Long id){

        return scoreService.getScoreById(id);
    }
}
