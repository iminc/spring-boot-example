package com.blog.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jim on 17-7-8.
 */
public interface BasicService<T, ID extends Serializable> {

    <S extends T> S save(S entity);

    T findOne(ID primaryKey);

    List<T> findAll();

    Long count();

    void delete(T entity);

    boolean exists(ID primaryKey);

}
