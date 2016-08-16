package com.springbootmybatis.demo.mapper;

import com.springbootmybatis.demo.commom.mapper.BaseMapper;
import com.springbootmybatis.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */
@Repository
public interface userMapper extends BaseMapper<User,Integer> {
}
