package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.model.Account;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Comparator;
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
@Order(0)
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

    @Test
    void shouldGetAutoCreationDate() {
        Account testAccount = new Account();
        testAccount.setName("Halil");
        LocalDateTime actualCreationDate = LocalDateTime.now();
        this.controller.save(testAccount);
        Account savedAccountRecord = getLatestAccount();
        LocalDateTime creationDateInDatabase = savedAccountRecord.getCreationDate();
        //Comparing the hour and minute with the created entity
        assertEquals(actualCreationDate.getHour(), creationDateInDatabase.getHour());
        assertEquals(actualCreationDate.getMinute(), creationDateInDatabase.getMinute());
    }

    @Test
    void shouldHavePrecisionatedBalance() {
        Account testAccount = new Account();
        testAccount.setName("Önder Odabaş");
        testAccount.setBalance(123.5f);
        testAccount.setAddress("Balıkesir/Turkey");
        testAccount.setCurrency("TRY");
        this.controller.save(testAccount);
        Account savedAccountRecord = getLatestAccount();
        assertEquals(testAccount.getBalance(), savedAccountRecord.getBalance());
    }

    private Account getLatestAccount() {
        List<Account> accountList = this.controller.findAll();
        //Sorting by id
        accountList.sort(Comparator.comparing(Account::getId));
        //Getting the highest id of the most recent record
        return accountList.get(accountList.size() - 1);
    }
}