package com.sonhal.simpleaccountantprogram.api.impl;

import com.sonhal.simpleaccountantprogram.api.AbstractBaseController;
import com.sonhal.simpleaccountantprogram.model.Category;
import com.sonhal.simpleaccountantprogram.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CategoryController
 *
 * @author s84240320
 * @since 2022-04-30
 */
@RequestMapping("/categories")
@RestController
public class CategoryController extends AbstractBaseController<Category> {
    @Autowired
    public CategoryController(BaseService<Category> service) {
        super(service);
    }
}
