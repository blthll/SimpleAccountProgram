package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.model.Account;
import com.sonhal.simpleaccountantprogram.model.Invoice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * InvoiceControllerTest
 *
 * @author s84240320
 * @since 2022-05-03
 */
@SpringBootTest
@Order(1)
class InvoiceControllerTest {
    @Autowired
    InvoiceController controller;

    @Autowired
    AccountController accountController;
    private Account testAccount;

    @BeforeEach
    void setup() {
        testAccount = this.accountController.findById(5);
    }

    @Test
    void shouldCreateAnIncomeInvoice() {
        List<Invoice> oldList = this.controller.findAll();

        Invoice testInvoice = new Invoice();
        testInvoice.setType(Invoice.Type.INCOME);
        testInvoice.setDateOfInvoice(new Timestamp(System.currentTimeMillis()));
        testInvoice.setPrice(123.5f);
        testInvoice.setAccount(testAccount);

        this.controller.save(testInvoice);

        List<Invoice> newList = this.controller.findAll();
        // Did list increment by one?
        assertEquals(oldList.size() + 1, newList.size());
        Invoice createdInvoice = getLatestInvoice();
        // Did test account bound successfully by account id?
        assertEquals(createdInvoice.getAccount().getId(), testAccount.getId());
    }


    private Invoice getLatestInvoice() {
        List<Invoice> invoices = this.controller.findAll();
        //Sorting by id
        invoices.sort(Comparator.comparing(Invoice::getId));
        //Getting the highest id of the most recent record
        return invoices.get(invoices.size() - 1);
    }
}