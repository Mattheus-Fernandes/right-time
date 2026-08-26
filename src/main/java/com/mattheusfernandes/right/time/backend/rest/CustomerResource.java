package com.mattheusfernandes.right.time.backend.rest;

import com.mattheusfernandes.right.time.backend.domain.service.CustomerService;
import com.mattheusfernandes.right.time.backend.rest.dto.CreateCustomerRequest;
import com.mattheusfernandes.right.time.backend.rest.dto.CustomerResponse;
import com.mattheusfernandes.right.time.backend.rest.dto.ErrorMessage;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.ExampleObject;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    private CustomerService customerService;

    @Operation(
            summary = "Criar cliente",
            description = "Criar um novo cliente"
    )
    @APIResponse(
            responseCode = "201",
            description = "Cliente cadastrado com sucesso",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(implementation = CustomerResponse.class)
            )
    )
    @APIResponse(
            responseCode = "400",
            description = "Dados inválidos ou campos obrigatórios não preenchidos",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(implementation = ErrorMessage.class),
                    examples = {
                            @ExampleObject(
                                    name = "Nome obrigatório",
                                    value = """
                                       {
                                            "status": 400,
                                            "message": "Nome é obrigatório"
                                        }
                                       """
                            ),
                            @ExampleObject(
                                    name = "Sobrenome obrigatório",
                                    value = """
                                        {
                                            "status": 400,
                                            "message": "Sobrenome é obrigatório"
                                        }
                                        """
                            ),
                            @ExampleObject(
                                    name = "Celular obrigatório",
                                    value = """
                                        {
                                            "status": 400,
                                            "message": "Número de celular é obrigatório"
                                        }
                                        """
                            ),
                            @ExampleObject(
                                    name = "Número de celular deve ser maior do que 11 dígitos",
                                    value = """
                                        {
                                            "status": 400,
                                            "message": "Número de celular deve possuir 11 dígitos"
                                        }
                                        """
                            )
                    }
            )

    )
    @APIResponse(
            responseCode = "409",
            description = "Cliente ou celular já cadastrado",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(implementation = ErrorMessage.class)
            )

    )
    @POST
    public Response createCustomer(CreateCustomerRequest request) {

        return Response
                .status(Response.Status.CREATED)
                .entity(customerService.saveCustomer(request))
                .build();
    }
}
