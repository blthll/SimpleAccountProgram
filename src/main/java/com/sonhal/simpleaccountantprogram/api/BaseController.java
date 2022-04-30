package com.sonhal.simpleaccountantprogram.api;

import java.io.Serializable;
import java.util.List;

/**
 * BaseController
 *
 * @author s84240320
 * @since 2022-04-30
 */
public interface BaseController<E> {
    List<E> findAll();

    E findById(Serializable id);

    void save(E entity);

    void saveOrUpdate(E entity);

    void delete(E entity);
}
