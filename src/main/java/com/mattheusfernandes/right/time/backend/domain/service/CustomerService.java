package com.mattheusfernandes.right.time.backend.domain.service;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import com.mattheusfernandes.right.time.backend.domain.repository.CustomerRepositoryImp;
import com.mattheusfernandes.right.time.backend.rest.dto.CreateCustomerRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.UUID;

@ApplicationScoped
public class CustomerService {

    @Inject
    private CustomerRepositoryImp customerRepository;

    public UUID saveCustomer(CreateCustomerRequest request) {

        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setLastname(request.lastname());
        customer.setPhone(request.phone());

        return customerRepository.insertNewCustomer(customer);
    }
}
