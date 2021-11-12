package com.atguigu.admin;

/** 
 *  @Author   ZhaoJie
 *  @Version  1.0
 *  @Data     2021/11/12 10:00
 *  @Email    17854262969@163.com
*/

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@SpringBootApplication
@EnableDubbo
@MapperScan({"com.atguigu.admin.mapper","com.atguigu.admin.boom2.mapper"})
public class Boot05WebAdminApplication {



//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello,world";
//    }




    public static void main(String[] args) {

        SpringApplication.run(Boot05WebAdminApplication.class, args);
        System.out.println(">>>>>>>>>   mybatis start success    <<<<<<<<<<<<<<<<<");
    }



}
