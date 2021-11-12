package gem.dubbo.shop.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class GemDubboShopProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(GemDubboShopProviderApplication.class, args);
        System.out.println(">>>>>>>>>>>>>  shop provider success start  <<<<<<<<<");
    }

}
