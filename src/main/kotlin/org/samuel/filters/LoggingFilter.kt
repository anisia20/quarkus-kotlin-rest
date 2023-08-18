package org.samuel.filters

import io.quarkus.logging.Log
import io.vertx.core.http.HttpServerRequest
import jakarta.ws.rs.container.ContainerRequestContext
import jakarta.ws.rs.container.ContainerRequestFilter
import jakarta.ws.rs.core.Context
import jakarta.ws.rs.core.UriInfo
import jakarta.ws.rs.ext.Provider
import org.samuel.utils.getRemoteIpAddr


@Provider
class LoggingFilter : ContainerRequestFilter {
    @Context
    var info: UriInfo? = null

    @Context
    var request: HttpServerRequest? = null

    override fun filter(context: ContainerRequestContext) {
        val method = context.method
        val path = info!!.path
        val address: String? = getRemoteIpAddr(request!!)
        val headers = request!!.headers()
        Log.infof("start %s %s IP=%s, SUA=%s, SUM=%s, UA=%s", method, path, address, headers.get("sec-ch-ua"), headers.get("sec-ch-ua-mobile"), headers.get("User-Agent"));
    }
}