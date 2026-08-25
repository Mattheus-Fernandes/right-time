package com.mattheusfernandes.right.time.backend.domain.entity;

import com.mattheusfernandes.right.time.backend.utils.query.CustomerQuery;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "customers")
@Entity
@Getter
@Setter
@NoArgsConstructor
@NamedNativeQueries(
        @NamedNativeQuery(
                name = CustomerQuery.INSERT_NEW_CUSTOMER,
                query = CustomerQuery.INSERT_NEW_CUSTOMER_QUERY
        )
)
public class Customer {

    @Id
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;
}
