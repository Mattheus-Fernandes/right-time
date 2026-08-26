package com.mattheusfernandes.right.time.backend.domain.service;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import com.mattheusfernandes.right.time.backend.domain.mapper.CustomerMapper;
import com.mattheusfernandes.right.time.backend.domain.repository.CustomerRepositoryImp;
import com.mattheusfernandes.right.time.backend.rest.dto.CreateCustomerRequest;
import com.mattheusfernandes.right.time.backend.rest.dto.CustomerResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.UUID;

@ApplicationScoped
public class CustomerService {

    @Inject
    private CustomerRepositoryImp customerRepository;

    @Transactional
    public CustomerResponse saveCustomer(CreateCustomerRequest request) {

        Customer customer = CustomerMapper.toEntity(request);

        Customer savedCustomer = customerRepository.insertNewCustomer(customer);

        return CustomerMapper.toResponse(savedCustomer);
    }
}
