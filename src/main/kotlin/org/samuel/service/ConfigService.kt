package org.samuel.service

import io.signalstudio.model.Result
import jakarta.ws.rs.core.Response


class ConfigService {
    fun getConfig(ips: String): Response {
        val result = Result()
//        val ipfield = ips.replace(" ".toRegex(), "")
//        iamNewsCmd.getPersion(ipfield)
//        val gnbJsontstr: String = Def.GNBCODE_JSON
//        if (gnbJsontstr == null) {
//            log.error("do not found redis REDIS_NNC_S_GNB_CODE!!")
//            result.setResultFail(ResultCode.R_201)
//            return Response.accepted(result).status(HttpStatus.SC_INTERNAL_SERVER_ERROR).build()
//        }
//        val oidJsontstr: String = Def.OIDCODE_JSON
//        if (oidJsontstr == null) {
//            log.error("do not found redis REDIS_NNC_S_OID_CODE!!")
//            result.setResultFail(ResultCode.R_202)
//            return Response.accepted(result).status(HttpStatus.SC_INTERNAL_SERVER_ERROR).build()
//        }
//        var gnbMap: Map<String?, String?>? = null
//        var oidMap: Map<String?, String?>? = null
//        try {
//            gnbMap = jsonb.fromJson(gnbJsontstr, Map::class.java)
//            oidMap = jsonb.fromJson(oidJsontstr, Map::class.java)
//        } catch (e: Exception) {
//            log.error("do not parse jsonstr config from redis G=$gnbJsontstr, O=$oidJsontstr")
//            result.setResultFail(ResultCode.R_203)
//            return Response.accepted(result).status(HttpStatus.SC_INTERNAL_SERVER_ERROR).build()
//        }
//        val r_data = ConfigResultDto()
//        r_data.setGnb(gnbMap)
//        r_data.setOid(oidMap)
//        result.setSuccess(r_data)
//        return Response.ok(result).build()
        return Response.ok().build()
    }

}