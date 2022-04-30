package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.api.AbstractBaseController;
import com.sonhal.simpleaccountantprogram.model.Account;
import com.sonhal.simpleaccountantprogram.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 *
 * @author s84240320
 * @since 2022-04-30
 */
@RequestMapping("/accounts")
@RestController
public class AccountController extends AbstractBaseController<Account> {
    @Autowired
    public AccountController(BaseService<Account> service) {
        super(service);
    }
}
