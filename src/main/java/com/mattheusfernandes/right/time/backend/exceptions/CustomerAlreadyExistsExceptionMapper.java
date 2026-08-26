package com.mattheusfernandes.right.time.backend.exceptions;

import com.mattheusfernandes.right.time.backend.rest.dto.ErrorMessage;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CustomerAlreadyExistsExceptionMapper implements ExceptionMapper<CustomerAlreadyExistsException> {

    @Override
    public Response toResponse(CustomerAlreadyExistsException exception) {

        return Response
                .status(Response.Status.CONFLICT)
                .entity(new ErrorMessage(Response.Status.CONFLICT.getStatusCode(), exception.getMessage()))
                .build();
    }
}
