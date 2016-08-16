package com.springbootmybatis.demo.commom.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.io.Serializable;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */
public interface BaseMapper<T,ID extends Serializable> extends Mapper<T>,MySqlMapper<T> {

    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
