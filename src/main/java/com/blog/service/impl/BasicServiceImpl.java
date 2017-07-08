package com.blog.service.impl;

import com.blog.repository.BasicRepository;
import com.blog.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jim on 17-7-8.
 */
public class BasicServiceImpl<T, ID extends Serializable> implements BasicService<T, ID> {

    @Autowired
    BasicRepository<T, ID> basicRepository;

    @Override
    public <S extends T> S save(S entity) {
        return basicRepository.save(entity);
    }

    @Override
    public T findOne(ID primaryKey) {
        return basicRepository.findOne(primaryKey);
    }

    @Override
    public List<T> findAll() {
        return basicRepository.findAll();
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public boolean exists(ID primaryKey) {
        return false;
    }
}
