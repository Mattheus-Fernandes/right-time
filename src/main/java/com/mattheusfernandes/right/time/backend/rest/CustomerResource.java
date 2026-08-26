package com.mattheusfernandes.right.time.backend.rest;

import com.mattheusfernandes.right.time.backend.domain.service.CustomerService;
import com.mattheusfernandes.right.time.backend.rest.dto.CreateCustomerRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    private CustomerService customerService;

    @POST
    public Response createCustomer(CreateCustomerRequest request) {
        UUID id = customerService.saveCustomer(request);

        return Response
                .status(Response.Status.CREATED)
                .entity(id)
                .build();
    }
}
