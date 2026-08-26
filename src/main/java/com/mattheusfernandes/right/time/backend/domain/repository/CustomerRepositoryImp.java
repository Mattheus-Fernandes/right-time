package com.mattheusfernandes.right.time.backend.domain.repository;

import com.mattheusfernandes.right.time.backend.domain.DAO.CustomerDAO;
import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.UUID;

@ApplicationScoped
public class CustomerRepositoryImp implements CustomerRepository {

    @Inject
    private CustomerDAO customerDAO;

    @Override
    public Customer insertNewCustomer(Customer customer) {
        return customerDAO.insertNewCustomer(customer);
    }

    @Override
    public boolean existsByFullname(String name, String lastname) {
        return customerDAO.existsByFullname(name, lastname);
    }

    @Override
    public boolean existsByPhone(String phone) {
        return customerDAO.existsByPhone(phone);
    }

}
