package com.codegym.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "withdraws")
public class Withdraw extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "transaction_amount", precision = 12, nullable = false)
    private BigDecimal transactionAmount;

    public Withdraw() {
    }

    public Withdraw(Long id, BigDecimal transactionAmount, Customer customer) {
        this.id = id;
        this.transactionAmount = transactionAmount;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
