package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Score;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapperPlus extends BaseMapper<Score> {
    public Score getById(Integer id);
    public Score getByIdAndLocation(Integer id);
    public Score getByIdStep(Integer id);
    public List<Score> getByIf(Score score);
    public List<Score> getByEach(List<Integer> integers);

}
