package com.mattheusfernandes.right.time.backend.utils.query;

public class CustomerQuery {

    private static final String INSERT_NEW_CUSTOMER = "Customer.insertNewCustomer";

    private static final String INSERT_NEW_CUSTOMER_QUERY = """
            INSERT INTO customers(
                name,
                lastname,
                phone
            )
            VALUES(
                :name,
                :lastname,
                :phone
            )
            """;

}
