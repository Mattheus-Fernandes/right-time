package com.mattheusfernandes.right.time.backend.domain.repository;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;

import java.util.UUID;

public interface CustomerRepository {
    Customer insertNewCustomer(Customer customer);
}
