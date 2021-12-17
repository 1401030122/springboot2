package gem.dubbo.shop.consumer;
/** 
 *  @Author   ZhaoJie
 *  @Version  1.0
 *  @Data     2021/11/12 10:32
 *  @Email    17854262969@163.com
*/
import com.atguigu.admin.bean.Score;
import com.atguigu.admin.service.ScoreServicePlus;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@SpringBootTest
class GemDubboShopConsumerApplicationTests {

    @Test
    void contextLoads() {
    }

    @DubboReference
    ScoreServicePlus scoreServicePlus;

    @Test
    void scoreTestForEach(){

        try {
            List<Integer> integers = new ArrayList<>();
            integers.add(2);
            integers.add(3);
            integers.add(4);

            List<Score> scores = scoreServicePlus.getByEach(integers);

            log.info("------查询结果为:{}",scores);
            log.info("------查询结果为:{}",integers);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
