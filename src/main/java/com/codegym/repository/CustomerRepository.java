package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Iterable<Customer> findAllByDeletedIsFalse();

    Iterable<Customer> findAllByIdNot(Long id);

    Iterable<Customer> findAllByDeletedIsFalseAndIdIsNot(Long id);
}