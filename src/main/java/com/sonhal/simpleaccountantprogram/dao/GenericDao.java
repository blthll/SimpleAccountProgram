package com.sonhal.simpleaccountantprogram.dao;

import java.io.Serializable;
import java.util.List;

/**
 * BaseDao
 *
 * @author s84240320
 * @since 2022-04-29
 */
public interface GenericDao<E> {
    List<E> findAll();

    E findById(Serializable id);

    void save(E entity);

    void saveOrUpdate(E entity);

    void delete(E entity);
}
