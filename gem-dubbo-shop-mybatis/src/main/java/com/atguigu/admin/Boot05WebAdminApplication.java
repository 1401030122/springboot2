package com.atguigu.admin;



import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan({"com.atguigu.admin.mapper","com.atguigu.admin.boom2.mapper"})
public class Boot05WebAdminApplication {

    public static void main(String[] args) {

        SpringApplication.run(Boot05WebAdminApplication.class, args);
    }

}
