package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.api.AbstractBaseController;
import com.sonhal.simpleaccountantprogram.model.Product;
import com.sonhal.simpleaccountantprogram.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 *
 * @author s84240320
 * @since 2022-04-30
 */
@RequestMapping("/products")
@RestController
public class ProductController extends AbstractBaseController<Product> {
    @Autowired
    public ProductController(BaseService<Product> service) {
        super(service);
    }
}
