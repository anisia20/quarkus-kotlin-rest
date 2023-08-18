package org.samuel.service

import io.signalstudio.model.Result
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.core.Response
import org.samuel.model.dto.ConfigDto
import org.samuel.model.dto.ConfigResultDto

@ApplicationScoped
class ConfigService {
    fun getConfig(dto : ConfigDto): Response {
        val result = Result()

        //TODO make data

        val rData = ConfigResultDto("test")
        result.setSuccess(rData)
        return Response.ok(result).build()
    }

}