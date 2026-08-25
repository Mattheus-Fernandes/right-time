package com.mattheusfernandes.right.time.backend.utils.query;

public class CustomerQuery {

    public static final String INSERT_NEW_CUSTOMER = "Customer.insertNewCustomer";

    public static final String INSERT_NEW_CUSTOMER_QUERY = """
            INSERT INTO customers(
                id,
                name,
                lastname,
                phone
            )
            VALUES(
                :id,
                :name,
                :lastname,
                :phone
            )
            """;

}
