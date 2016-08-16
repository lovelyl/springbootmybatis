package com.springbootmybatis.demo.commom.service.Impl;

import com.github.pagehelper.PageHelper;
import com.springbootmybatis.demo.commom.mapper.BaseMapper;
import com.springbootmybatis.demo.commom.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */
public class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T,ID> {

    protected BaseMapper<T,ID> BaseMapper;

    public com.springbootmybatis.demo.commom.mapper.BaseMapper<T, ID> getBaseMapper() {
        return BaseMapper;
    }
    @Autowired
    public void setBaseMapper(com.springbootmybatis.demo.commom.mapper.BaseMapper<T, ID> baseMapper) {
        BaseMapper = baseMapper;
    }

    @Override
    public Integer save(T t) {
        return getBaseMapper().insert(t);
    }

    @Override
    public Integer update(T t) {
        return getBaseMapper().updateByPrimaryKey(t);
    }

    @Override
    public Integer delete(ID id) {
        return getBaseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public Integer delete(T t) {
        return getBaseMapper().delete(t);
    }

    @Override
    public T findOne(ID id) {
        return getBaseMapper().selectByPrimaryKey(id);
    }

    @Override
    public boolean exists(ID id) {
        boolean flag=false;
        if (getBaseMapper().selectByPrimaryKey(id)!=null)
            flag=true;
        return flag;
    }


    @Override
    public List<T> findAll() {
        return getBaseMapper().selectAll();
    }

    @Override
    public List<T> findAll(Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(),pageable.getPageSize(), String.valueOf(pageable.getSort()));
        return getBaseMapper().selectAll();
    }
}
