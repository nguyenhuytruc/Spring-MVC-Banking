package com.codegym.service.customer;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {


    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.getById(id);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
    }
    @Override
    public Iterable<Customer> findAllByDeletedIsFalse() {
        return customerRepository.findAllByDeletedIsFalse ();
    }

    @Override
    public Iterable<Customer> findAllByIdNot(Long id) {
        return customerRepository.findAllByIdNot(id);
    }

    @Override
    public Iterable<Customer> findAllByDeletedIsFalseAndIdIsNot(Long id) {
        return customerRepository.findAllByDeletedIsFalseAndIdIsNot ( id );
    }

}
