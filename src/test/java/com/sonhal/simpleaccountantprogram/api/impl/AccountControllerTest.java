package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * AccountControllerTest
 *
 * @author s84240320
 * @since 2022-05-01
 */
@SpringBootTest
class AccountControllerTest {
    @Autowired
    AccountController controller;

    @Test
    void shouldGetAccounts() {
        List<Account> fetchedAccounts = controller.findAll();
        assertNotEquals(0, fetchedAccounts.size());
    }

    @Test
    void shouldAddOneAccount() {
        List<Account> oldList = this.controller.findAll();
        Account testAccount = new Account();
        testAccount.setName("Soner");
        this.controller.save(testAccount);
        List<Account> newList = this.controller.findAll();
        assertEquals(oldList.size() + 1, newList.size());
    }
}