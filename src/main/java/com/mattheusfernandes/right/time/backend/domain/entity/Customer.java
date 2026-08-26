package com.mattheusfernandes.right.time.backend.domain.entity;

import com.mattheusfernandes.right.time.backend.utils.query.CustomerQuery;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Table(name = "customers")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@NamedNativeQueries({
        @NamedNativeQuery(
                name = CustomerQuery.INSERT_NEW_CUSTOMER,
                query = CustomerQuery.INSERT_NEW_CUSTOMER_QUERY
        ),
        @NamedNativeQuery(
                name = CustomerQuery.EXISTS_BY_FULLNAME,
                query = CustomerQuery.EXISTS_BY_FULLNAME_QUERY
        ),
        @NamedNativeQuery(
                name = CustomerQuery.EXISTS_BY_PHONE,
                query = CustomerQuery.EXISTS_BY_PHONE_QUERY
        )
})
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
