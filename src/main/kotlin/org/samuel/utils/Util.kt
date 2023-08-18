package org.samuel.utils

import io.quarkus.runtime.util.StringUtil.isNullOrEmpty
import io.vertx.core.http.HttpServerRequest

fun getRemoteIpAddr(request: HttpServerRequest): String? {
    var ip: String? = ""
    ip = request.remoteAddress().hostAddress()
    if(!isNullOrEmpty(ip)) return ip

    val xForwardedValue: String = request.headers().get("X-Forwarded-For")
    if (isNullOrEmpty(xForwardedValue)) {
        return ip
    }
    ip = xForwardedValue
    return ip
}