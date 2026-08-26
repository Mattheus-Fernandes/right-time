package com.mattheusfernandes.right.time.backend.domain.DAO;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import com.mattheusfernandes.right.time.backend.utils.query.CustomerQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.UUID;

@ApplicationScoped
public class CustomerDAO {

    @Inject
    private EntityManager entityManager;

    public Customer insertNewCustomer(Customer customer) {

        UUID id = UUID.randomUUID();

        entityManager
                .createNamedQuery(CustomerQuery.INSERT_NEW_CUSTOMER)
                .setParameter("id", id)
                .setParameter("name", customer.getName())
                .setParameter("lastname", customer.getLastname())
                .setParameter("phone", customer.getPhone())
                .executeUpdate();

        customer.setId(id);

        return customer;
    }
}
