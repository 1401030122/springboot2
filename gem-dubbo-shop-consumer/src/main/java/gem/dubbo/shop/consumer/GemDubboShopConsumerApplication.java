package gem.dubbo.shop.consumer;


//import com.atguigu.admin.bean.Score;
//import com.atguigu.admin.mapper.GetScoreMapper;
//import com.atguigu.admin.mapper.GetScoreMapper;
//import com.atguigu.admin.mapper.GetScoreMapper;
import com.atguigu.admin.bean.Score;
import com.atguigu.admin.mapper.GetScoreMapper;
import com.atguigu.admin.service.ScoreService;
import com.atguigu.admin.service.ScoreServicePlus;
import gem.dubbo.shop.provider.service.RpcShopService;
import gem.dubbo.shop.provider.service.impl.ShopServiceImpl;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@SpringBootApplication
@RestController
public class GemDubboShopConsumerApplication {

    @DubboReference
    RpcShopService shopService;
    @DubboReference
    ScoreService scoreService;

    @DubboReference
    ScoreServicePlus scoreServicePlus;

    @RequestMapping("/sayhello")
    public String sayHello(){
        return shopService.sayHello("Hello ss Dubbo Nacos!更多原创分享，技术交流，关注：Java技术干货（ID:raysonfang）");
    }
    @RequestMapping("/score")
    public Score getScore(@RequestParam("id") Long id){
        return scoreService.getById(id);
    }

    @RequestMapping("/scoreplus")
    public Score getScore(@RequestParam("id")Integer id){
        return scoreServicePlus.getById(id);
    }


    public static void main(String[] args) {
        SpringApplication.run(GemDubboShopConsumerApplication.class, args);
    }

}
