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

    public static final String EXISTS_BY_FULLNAME = "Customer.existsByFullname";

    public static final String EXISTS_BY_FULLNAME_QUERY = """
            SELECT COUNT(*)
            FROM Customers
            WHERE LOWER(name) = LOWER(:name)
            AND LOWER(lastname) = LOWER(:lastname)
            """;
    public static final String EXISTS_BY_PHONE =
            "Customer.existsByPhone";

    public static final String EXISTS_BY_PHONE_QUERY = """
            SELECT COUNT(*)
            FROM customers
            WHERE phone = :phone
            """;
}
