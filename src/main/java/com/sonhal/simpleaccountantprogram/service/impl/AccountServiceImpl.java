package com.sonhal.simpleaccountantprogram.service.impl;

import com.sonhal.simpleaccountantprogram.dao.impl.AccountDaoImpl;
import com.sonhal.simpleaccountantprogram.model.Account;
import com.sonhal.simpleaccountantprogram.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AccountServiceImpl
 *
 * @author s84240320
 * @since 2022-04-30
 */
@Service
public class AccountServiceImpl extends AbstractBaseService<Account> {

    @Autowired
    public AccountServiceImpl(AccountDaoImpl baseDao) {
        super(baseDao);
    }
}
