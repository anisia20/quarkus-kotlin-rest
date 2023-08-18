package org.samuel.controller

import io.quarkus.logging.Log
import jakarta.annotation.security.PermitAll
import jakarta.enterprise.context.RequestScoped
import jakarta.enterprise.inject.Default
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response
import org.samuel.model.dto.ConfigDto
import org.samuel.service.ConfigService


@Path("/config")
@RequestScoped
class ConfigController{

    @Inject
    @field: Default
    lateinit var service: ConfigService

    @POST
    @Path("/getdata")
    @Produces(MediaType.APPLICATION_JSON)
    @PermitAll
    fun getConfig( dto : ConfigDto) : Response {
        return service.getConfig(dto)
    }

}