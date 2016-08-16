package com.springbootmybatis.demo.service.Impl;

import com.springbootmybatis.demo.commom.mapper.BaseMapper;
import com.springbootmybatis.demo.commom.service.Impl.BaseServiceImpl;
import com.springbootmybatis.demo.domain.User;
import com.springbootmybatis.demo.mapper.userMapper;
import com.springbootmybatis.demo.service.userService;
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
@DependsOn("userMapper")
public class userServiceImpl extends BaseServiceImpl<User,Integer> implements userService {

    @Autowired
    private userMapper userMapper;

    @Qualifier("userMapper")
    @Override
    @Autowired
    public void setBaseMapper(com.springbootmybatis.demo.commom.mapper.BaseMapper<User, Integer> baseMapper) {
        super.setBaseMapper(baseMapper);
    }
}
