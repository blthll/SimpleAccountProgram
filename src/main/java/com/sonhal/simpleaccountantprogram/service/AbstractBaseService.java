package com.sonhal.simpleaccountantprogram.service;

import com.sonhal.simpleaccountantprogram.dao.AbstractBaseDao;
import com.sonhal.simpleaccountantprogram.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * AbstractBaseService
 *
 * @author s84240320
 * @since 2022-04-30
 */
@Service
public class AbstractBaseService<E> implements BaseService<E> {

    private final BaseDao<E> baseDao;

    public AbstractBaseService(AbstractBaseDao<E> baseDao) {
        this.baseDao = baseDao;
    }
    @Transactional
    @Override
    public List<E> findAll() {
        return this.baseDao.findAll();
    }
    @Transactional
    @Override
    public E findById(Serializable id) {
        return this.baseDao.findById(id);
    }
    @Transactional
    @Override
    public void save(E entity) {
        this.baseDao.save(entity);
    }
    @Transactional
    @Override
    public void saveOrUpdate(E entity) {
        this.baseDao.saveOrUpdate(entity);
    }
    @Transactional
    @Override
    public void delete(E entity) {
        this.baseDao.delete(entity);
    }
}
