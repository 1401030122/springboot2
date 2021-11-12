package com.atguigu.admin.service.imp;

import com.atguigu.admin.bean.Score;
import com.atguigu.admin.mapper.ScoreMapperPlus;
import com.atguigu.admin.service.ScoreServicePlus;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.List;

@Service
@DubboService
public class ScoreServicePlusImp implements ScoreServicePlus {

    @Autowired
    ScoreMapperPlus scoreMapperPlus;
    @Override
    public Score getById(Integer id){
        return scoreMapperPlus.getById(id);
    }

    @Override
    public Score getByIdAndLocation(Integer id){
        return scoreMapperPlus.getByIdAndLocation(id);
    }
    @Override
    public Score getByIdStep(Integer id){
        return scoreMapperPlus.getByIdStep(id);
    }
    @Override
    public List<Score> getByIf(Score score){
        return scoreMapperPlus.getByIf(score);
    }
    @Override
    public List<Score> getByEach(List<Integer> integers){
        return scoreMapperPlus.getByEach(integers);
    }
}
