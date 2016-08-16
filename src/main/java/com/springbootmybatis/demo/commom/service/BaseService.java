package com.springbootmybatis.demo.commom.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */
public interface BaseService <T,ID extends Serializable> {

    Integer save(T t);

    Integer update(T t);

    Integer delete(ID id);

    Integer delete(T t);

    T findOne(ID id);

    boolean exists(ID id);

    List<T> findAll();

    List<T> findAll(Pageable pageable);

}
