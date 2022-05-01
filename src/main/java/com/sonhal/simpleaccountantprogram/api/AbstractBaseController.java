package com.sonhal.simpleaccountantprogram.api;

import com.sonhal.simpleaccountantprogram.service.BaseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * AbstractBaseController
 *
 * @author s84240320
 * @since 2022-04-30
 */
public class AbstractBaseController<E> implements BaseController<E> {

    private final BaseService<E> service;

    public AbstractBaseController(BaseService<E> service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public List<E> findAll() {
        return this.service.findAll();
    }

    @GetMapping(path = "{id}")
    @Override
    public E findById(@PathVariable("id") Serializable id) {
        return this.service.findById(id);
    }

    @PostMapping
    @Override
    public void save(@RequestBody E entity) {
        this.service.save(entity);
    }

    @PutMapping
    @Override
    public void saveOrUpdate(E entity) {
        this.service.saveOrUpdate(entity);
    }

    @DeleteMapping
    @Override
    public void delete(E entity) {
        this.service.delete(entity);
    }
}
