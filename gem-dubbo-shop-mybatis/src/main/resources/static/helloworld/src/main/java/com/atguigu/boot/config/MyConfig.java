package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @ConditionalOnBean(name ="tom")
    @Bean
    public User user01(){
        return new User("张三",22);
    }

    @Bean("tom")
    public Pet pet01(){
        return new Pet("狗狗",2);
    }
}
