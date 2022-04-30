package com.sonhal.simpleaccountantprogram.dao;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericDao<T extends Serializable>
        extends AbstractBaseDao<T> implements BaseDao<T>{
    //
}