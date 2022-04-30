package com.sonhal.simpleaccountantprogram.service.impl;

import com.sonhal.simpleaccountantprogram.dao.impl.ReceiptDaoImpl;
import com.sonhal.simpleaccountantprogram.model.Receipt;
import com.sonhal.simpleaccountantprogram.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ReceiptServiceImpl
 *
 * @author s84240320
 * @since 2022-04-30
 */
@Service
public class ReceiptServiceImpl extends AbstractBaseService<Receipt> {
    @Autowired
    public ReceiptServiceImpl(ReceiptDaoImpl baseDao) {
        super(baseDao);
    }
}
