package com.atguigu.admin.service;

import com.atguigu.admin.bean.Score;

import java.util.List;

public interface ScoreServicePlus {
    public Score getById(Integer id);


    public Score getByIdAndLocation(Integer id);

    public Score getByIdStep(Integer id);

    public List<Score> getByIf(Score score);

    public List<Score> getByEach(List<Integer> integers);
}
