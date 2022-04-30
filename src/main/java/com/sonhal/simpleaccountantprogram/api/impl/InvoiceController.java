package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.api.AbstractBaseController;
import com.sonhal.simpleaccountantprogram.model.Invoice;
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
@RequestMapping("/invoices")
@RestController
public class InvoiceController extends AbstractBaseController<Invoice> {

    @Autowired
    public InvoiceController(BaseService<Invoice> service) {
        super(service);
    }
}
