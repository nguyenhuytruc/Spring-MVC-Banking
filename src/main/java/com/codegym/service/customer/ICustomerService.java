package com.codegym.service.customer;

import com.codegym.model.Customer;
import com.codegym.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByDeletedIsFalse();

    Iterable<Customer> findAllByIdNot(Long id);

    Iterable<Customer> findAllByDeletedIsFalseAndIdIsNot(Long id);
}
