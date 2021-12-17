package com.atguigu.admin;

/** 
 *  @Author   ZhaoJie
 *  @Version  1.0
 *  @Data     2021/11/12 17:08
 *  @Email    17854262969@163.com
*/

import com.atguigu.admin.bean.Location;
import com.atguigu.admin.bean.Score;
import com.atguigu.admin.boom2.entity.Boom2;
import com.atguigu.admin.boom2.service.Boom2Service;
import com.atguigu.admin.service.LocationService;
import com.atguigu.admin.service.imp.ScoreServiceImp;
import com.atguigu.admin.service.imp.ScoreServicePlusImp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.*;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
        Long aLong =  jdbcTemplate.queryForObject("select count(*) from boom2",Long.class);
        log.info("查询数目:{}",aLong);
    }

    @Autowired
    Boom2Service boom2Service;

    @Test
    void boom2Test(){
        Boom2 boom2 = boom2Service.getById(2);
        log.info("查询数目:{}",boom2);
    }

    @Test
    void boom2TestBoomTime(){
        Boom2 boom2 = new Boom2();
        boom2.setId(10);
        boom2.setBoomTime(5);
        boom2.setNumber("星期一");
        boom2Service.save(boom2);
    }


    @Autowired
    ScoreServiceImp scoreService;



    @Test
    void scoreTest(){

        Map<String,Object> map = new HashMap<>();
        map.put("id",21);
        map.put("name","赵杰");
        Score score = scoreService.getByMap(map);
        log.info("------查询结果为:{}",score);


//        测试删除功能
//        scoreService.deleteScore(7);
//        log.info("delete success");
    }

    @Test
    void scoreTest1(){
//        try {
//            Map<String,Object> map = scoreService.getByIdReturnMap(20);
//            log.info("------查询结果为:{}",map.get("name"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            Map<Integer,Score> map = scoreService.getMultiMapByNameLike("%赵%");
            log.info("------查询结果为:{}",map.get(20));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Autowired
    ScoreServicePlusImp scoreServicePlus;
    @Test
    void scoreTestPlus(){

        try {
            Score score = scoreServicePlus.getById(3);
            log.info("------查询结果为:{}",score);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void scoreT2(){

        try {
            Score score = scoreServicePlus.getByIdStep(20);
            log.info("------查询结果为:{}",score);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Autowired
    LocationService locationService;

    @Test
    void locationTest(){

        try {
            Location location = locationService.getById(1);
            log.info("------查询结果为:{}",location);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void scoreTestIf(){

        try {
            Score score = new Score();
            score.setName("赵杰");
            score.setId(10);
            List<Score> scores = scoreServicePlus.getByIf(score);
            log.info("------查询结果为:{}",scores);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

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


//    test redis 的相关模块
    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void testRedis(){

        Score score = scoreServicePlus.getById(3);
        ValueOperations<String,String> operations= redisTemplate.opsForValue();
        operations.set("score",score.getName());
        String hello = operations.get("score");
        System.out.println("测试结果为："+score);
        Integer[] integers = new Integer[5];

    }

}
