package com.mattheusfernandes.right.time.backend.domain.mapper;

import com.mattheusfernandes.right.time.backend.domain.entity.Customer;
import com.mattheusfernandes.right.time.backend.rest.dto.CreateCustomerRequest;
import com.mattheusfernandes.right.time.backend.rest.dto.CustomerResponse;

public class CustomerMapper {

    public static Customer toEntity(CreateCustomerRequest request) {
        return Customer.builder()
                .name(request.name())
                .lastname(request.lastname())
                .phone(request.phone())
                .build();
    }

    public static CustomerResponse toResponse(Customer entity) {
        return CustomerResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .lastname(entity.getLastname())
                .phone(entity.getPhone())
                .build();
    }
}
