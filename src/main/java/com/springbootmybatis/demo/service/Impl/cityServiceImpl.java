package com.springbootmybatis.demo.service.Impl;

import com.springbootmybatis.demo.commom.mapper.BaseMapper;
import com.springbootmybatis.demo.commom.service.Impl.BaseServiceImpl;
import com.springbootmybatis.demo.domain.City;
import com.springbootmybatis.demo.mapper.cityMapper;
import com.springbootmybatis.demo.service.cityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */
@Service
@DependsOn("cityMapper")
public class cityServiceImpl extends BaseServiceImpl<City,Integer> implements cityService {

    private cityMapper cityMapper;

    @Qualifier("cityMapper")
    @Override
    @Autowired
    public void setBaseMapper(com.springbootmybatis.demo.commom.mapper.BaseMapper<City, Integer> baseMapper) {
        super.setBaseMapper(baseMapper);
    }
}
