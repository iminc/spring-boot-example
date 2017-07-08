package com.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jim on 17-7-8.
 */
public interface BasicRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

    List<T> findAll(Sort sort);

    Page<T> findAll(Pageable pageable);

}
