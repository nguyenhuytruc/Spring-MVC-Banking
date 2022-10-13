package com.codegym.service.deposit;

import com.codegym.model.Deposit;
import com.codegym.repository.DepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class DepositServiceImpl implements DepositService{
    @Autowired
    private DepositRepository depositRepository;
    @Override
    public Iterable<Deposit> findAll() {
        return null;
    }

    @Override
    public Deposit getById(Long id) {
        return null;
    }

    @Override
    public Optional<Deposit> findById(Long id) {
        return Optional.empty ();
    }

    @Override
    public Deposit save(Deposit deposit) {
        return depositRepository.save ( deposit );
    }

    @Override
    public void remove(Long id) {
        depositRepository.deleteById ( id );
    }
}
