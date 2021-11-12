package com.atguigu.admin.service;

import com.atguigu.admin.bean.Location;
import com.atguigu.admin.mapper.LocationMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LocationService {
    @Autowired
    LocationMapper locationMapper;
    public Location getById(Integer id){
        return locationMapper.getById(id);
    }
}
