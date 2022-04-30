package com.sonhal.simpleaccountantprogram.service;

import java.io.Serializable;
import java.util.List;

/**
 * ServiceBase
 *
 * @author s84240320
 * @since 2022-04-30
 */
public interface BaseService<E> {
    List<E> findAll();

    E findById(Serializable id);

    void save(E entity);

    void saveOrUpdate(E entity);

    void delete(E entity);
}
