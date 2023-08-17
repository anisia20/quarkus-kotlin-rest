package org.samuel.controller

import io.vertx.core.spi.observability.HttpRequest
import jakarta.annotation.security.PermitAll
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.core.Context
import org.apache.commons.logging.impl.JBossLogFactory


@Path("/")
class ConfigController {
    val log = JBossLogFactory.getFactory();

    @GET
    @Path("/")
    @PermitAll
    fun getConfig(@Context request : HttpRequest){
        val headers = request.headers()
    }

}