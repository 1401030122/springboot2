package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Score;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@Mapper

public interface GetScoreMapper extends BaseMapper<Score> {
    public Score getScore(Long id);
    public void updateScore(Score score);
    public void insertScore(Score score);
    public void deleteScore(Integer id);
    public Score getByIdAndName(Integer id, String name);
    public Score getByMap(Map<String,Object> map);

    public List<Score> getByNameLike(String name);


    public Map<String,Object> getByIdReturnMap(Integer id);

//    将模糊查询到的多条记录储存到map中
    @MapKey("id")
    public Map<Integer,Score> getMultiMapByNameLike(String name);
}
