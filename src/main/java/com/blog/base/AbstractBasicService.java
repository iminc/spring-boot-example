package com.blog.base;

import java.io.Serializable;

/**
 * Created by jim on 17-7-9.
 */
public abstract class AbstractBasicService<T, ID extends Serializable> implements BasicService<T, ID> {

    public abstract BasicRepository<T, ID> registryRepository();

    @Override
    public <S extends T> S save(S entity) {
        return registryRepository().save(entity);
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> entities) {
        return registryRepository().save(entities);
    }

    @Override
    public T findOne(ID id) {
        return registryRepository().findOne(id);
    }

    @Override
    public boolean exists(ID id) {
        return registryRepository().exists(id);
    }

    @Override
    public Iterable<T> findAll() {
        return registryRepository().findAll();
    }

    @Override
    public Iterable<T> findAll(Iterable<ID> ids) {
        return registryRepository().findAll(ids);
    }

    @Override
    public long count() {
        return registryRepository().count();
    }

    @Override
    public void delete(ID id) {
        registryRepository().delete(id);
    }

    @Override
    public void delete(T entity) {
        registryRepository().delete(entity);
    }

    @Override
    public void delete(Iterable<? extends T> entities) {
        registryRepository().delete(entities);
    }

    @Override
    public void deleteAll() {
        registryRepository().deleteAll();
    }
}
