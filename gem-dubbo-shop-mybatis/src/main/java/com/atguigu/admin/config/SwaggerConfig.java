package com.atguigu.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author ZhaoJie
 * @Version 1.0
 * @Data 21 16:34
 * @Email 17854262969@163.com
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final Contact DEFAULT_CONTACT = new Contact("赵杰", "不告诉你", "不想说");

    //    配置swagger的Docket实例
    @Bean
    public Docket docker(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("赵杰")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                .host("127.0.0.1:8082");
    }



//    不同的人可以配置不同的分组，只需要多设置几个docket就可以了
//    配置swagger的Docket实例
@Bean
public Docket docker1() {
    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .groupName("宋孟瑶")
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()
            .enable(true)
            .host("127.0.0.1:8082");
}

    public ApiInfo apiInfo(){
        return new ApiInfo("赵杰的第一个swagger集成实验",
                "文档说明书",
                "1.0",
                "urn:tos",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
