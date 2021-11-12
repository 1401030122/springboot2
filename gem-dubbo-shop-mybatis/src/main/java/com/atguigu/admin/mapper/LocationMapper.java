package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Location;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LocationMapper extends BaseMapper<Location> {
    public Location getById(Integer id);

}
