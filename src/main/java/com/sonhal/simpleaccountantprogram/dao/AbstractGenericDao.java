package com.sonhal.simpleaccountantprogram.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * AbstractGenericDao
 *
 * @author s84240320
 * @since 2022-04-29
 */
public abstract class AbstractGenericDao<E> implements GenericDao<E> {
    private final Class<E> entityClass;

    @Autowired
    private SessionFactory sessionFactory;


    protected AbstractGenericDao() {
        System.out.println("AAAA");
        this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public List<E> findAll() {
        CriteriaQuery<E> cr = getSession().getCriteriaBuilder().createQuery(this.entityClass);
        Root<E> root = cr.from(this.entityClass);
        cr.select(root);
        return getSession().createQuery(cr).getResultList();
    }

    @Override
    public E findById(final Serializable id) {
        return getSession().get(this.entityClass, id);
    }

    @Override
    public void save(E entity) {
        getSession().save(entity);
    }

    @Override
    public void saveOrUpdate(E entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(E entity) {
        getSession().delete(entity);
    }
}
