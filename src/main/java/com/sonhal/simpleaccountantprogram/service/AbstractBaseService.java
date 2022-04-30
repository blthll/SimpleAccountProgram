package com.sonhal.simpleaccountantprogram.service;

import com.sonhal.simpleaccountantprogram.dao.AbstractBaseDao;
import com.sonhal.simpleaccountantprogram.dao.BaseDao;

import java.io.Serializable;
import java.util.List;

/**
 * AbstractBaseService
 *
 * @author s84240320
 * @since 2022-04-30
 */
public class AbstractBaseService<E> implements BaseService<E> {

    private final BaseDao<E> baseDao;

    public AbstractBaseService(AbstractBaseDao<E> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public List<E> findAll() {
        return this.baseDao.findAll();
    }

    @Override
    public E findById(Serializable id) {
        return this.baseDao.findById(id);
    }

    @Override
    public void save(E entity) {
        this.baseDao.save(entity);
    }

    @Override
    public void saveOrUpdate(E entity) {
        this.baseDao.saveOrUpdate(entity);
    }

    @Override
    public void delete(E entity) {
        this.baseDao.delete(entity);
    }
}
