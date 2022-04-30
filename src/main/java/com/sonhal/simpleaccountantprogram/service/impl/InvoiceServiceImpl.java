package com.sonhal.simpleaccountantprogram.service.impl;

import com.sonhal.simpleaccountantprogram.dao.impl.InvoiceDaoImpl;
import com.sonhal.simpleaccountantprogram.model.Invoice;
import com.sonhal.simpleaccountantprogram.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * InvoiceServiceImpl
 *
 * @author s84240320
 * @since 2022-04-30
 */
@Service
public class InvoiceServiceImpl extends AbstractBaseService<Invoice> {
    @Autowired
    public InvoiceServiceImpl(InvoiceDaoImpl baseDao) {
        super(baseDao);
    }
}
