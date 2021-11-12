package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import javax.security.auth.login.Configuration;

/*
* 主程序类
* @SpringBootApplication这是一个spring的应用
* */

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.CUSTOM,
                classes = {TypeExcludeFilter.class}
        ), @ComponentScan.Filter(
                type = FilterType.CUSTOM,
                classes = {AutoConfigurationExcludeFilter.class}
        )}
)
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run=SpringApplication.run(MainApplication.class,args);
//        String [] names = run.getBeanDefinitionNames();
//        for(String name:names){
//            System.out.println(name);
//        }
//        boolean user01 = run.containsBean("user01");
//        System.out.println("组件中是不是有user01:"+ user01);
    }
}
