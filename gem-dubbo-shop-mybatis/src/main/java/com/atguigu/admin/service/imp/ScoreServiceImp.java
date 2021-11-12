package com.atguigu.admin.service.imp;

import com.atguigu.admin.bean.Score;

import com.atguigu.admin.mapper.GetScoreMapper;

import com.atguigu.admin.service.ScoreService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@DubboService
@Service
public class ScoreServiceImp implements ScoreService {

    @Autowired
    GetScoreMapper getScoreMapper;



    public Score getScoreById(Long id){
        return getScoreMapper.getScore(id);
    }


    public Score getScore(Long id) {
        return getScoreMapper.getScore(id);
    }

    public void updateScore(Score score){
        getScoreMapper.updateScore(score);

    }

    public void insertScore(Score score){
        getScoreMapper.insertScore(score);
    }

    public void deleteScore(Integer id){
        getScoreMapper.deleteScore(id);
    }

    public Score getByIdAndName(Integer id,String name){
        return getScoreMapper.getByIdAndName(id,name);
    }

    public Score getByMap(Map<String,Object> map){
        return getScoreMapper.getByMap(map);
    }

    public List<Score> getByNameLike(String name){
        return getScoreMapper.getByNameLike(name);
    }
    public Map<String, Object> getByIdReturnMap(Integer id){
        return getScoreMapper.getByIdReturnMap(id);
    }


    public Map<Integer,Score> getMultiMapByNameLike(String name){
        return getScoreMapper.getMultiMapByNameLike(name);
    }

    @Override
    public Score getById(Long id) {
        return getScoreMapper.getScore(id);
    }
}
