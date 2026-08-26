package com.mattheusfernandes.right.time.backend.domain.service;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import com.mattheusfernandes.right.time.backend.domain.mapper.CustomerMapper;
import com.mattheusfernandes.right.time.backend.domain.repository.CustomerRepositoryImp;
import com.mattheusfernandes.right.time.backend.exceptions.CustomerAlreadyExistsException;
import com.mattheusfernandes.right.time.backend.rest.dto.CreateCustomerRequest;
import com.mattheusfernandes.right.time.backend.rest.dto.CustomerResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CustomerService {

    @Inject
    private CustomerRepositoryImp customerRepository;

    @Transactional
    public CustomerResponse saveCustomer(CreateCustomerRequest request) {

        verifyCustomerFullname(request.name(), request.lastname());
        verifyCustomerPhone(request.phone());

        Customer customer = CustomerMapper.toEntity(request);

        Customer savedCustomer = customerRepository.insertNewCustomer(customer);

        return CustomerMapper.toResponse(savedCustomer);
    }

    private void verifyCustomerFullname(String name, String lastname) {
        if(customerRepository.existsByFullname(name, lastname)) {
            throw new CustomerAlreadyExistsException("Cliente já cadastrada");
        }
    }

    private void verifyCustomerPhone(String phone) {
        if(customerRepository.existsByPhone(phone)) {
            throw new CustomerAlreadyExistsException("Número de celular já cadastrado");
        }
    }
}
