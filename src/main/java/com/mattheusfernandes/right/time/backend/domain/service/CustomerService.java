package com.mattheusfernandes.right.time.backend.domain.service;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import com.mattheusfernandes.right.time.backend.domain.mapper.CustomerMapper;
import com.mattheusfernandes.right.time.backend.domain.repository.CustomerRepositoryImp;
import com.mattheusfernandes.right.time.backend.exceptions.CustomerAlreadyExistsException;
import com.mattheusfernandes.right.time.backend.exceptions.CustomerInvalidException;
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

        validateCustomer(request);
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

    private void validateCustomer(CreateCustomerRequest request) {
        if (request.name() == null || request.name().isBlank()) {
            throw new CustomerInvalidException("Nome é obrigatório");
        }

        if (request.lastname() == null || request.lastname().isBlank()) {
            throw new CustomerInvalidException("Sobrenome é obrigatório");
        }

        if (request.phone() == null || request.phone().isBlank()) {
            throw new CustomerInvalidException("Número de celular é obrigatório");
        }

        if (!request.phone().matches("\\d{11}")) {
            throw new CustomerInvalidException("Número de celular deve possuir 11 dígitos");
        }
    }
}
