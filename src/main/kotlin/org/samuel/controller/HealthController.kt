package org.samuel.controller

import jakarta.annotation.security.PermitAll
import jakarta.enterprise.context.RequestScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Response


@Path("/")
@RequestScoped
class HealthController {
    @GET
    @Path("health")
    @PermitAll
    fun health(): Response {
        return Response.ok().build()
    }
}