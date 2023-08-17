package io.signalstudio.model

import org.samuel.code.ResultCode
import java.util.*

class Result : HashMap<String?, Any?> {
    constructor() {}
    constructor(resultCode: ResultCode) {
        setResultData(resultCode)
    }

    constructor(resultCode: ResultCode, data: Any?) {
        setResultData(resultCode, data)
    }

    fun setSuccess() {
        setResultData(ResultCode.R_000)
    }

    fun setSuccess(data: Any?) {
        setResultData(ResultCode.R_000, data)
    }

    fun setResultFail() {
        setResultData(ResultCode.R_ETC.r, ResultCode.R_ETC.rd)
    }

    fun setResultFail(resultCode: ResultCode) {
        setResultData(resultCode.r, resultCode.rd)
    }

    fun setResultFail(resultCode: ResultCode, data: Any?) {
        setResultData(resultCode.r, resultCode.rd, data)
    }

    fun setResultFail(result: String?, resultDesc: String?) {
        setResultData(result, resultDesc)
    }

    fun setResultFail(result: String?, resultDesc: String?, data: Any?) {
        setResultData(result, resultDesc, data)
    }

    fun setResultData(resultCode: ResultCode) {
        setResultData(resultCode.r, resultCode.rd)
    }

    fun setResultData(resultCode: ResultCode, data: Any?) {
        setResultData(resultCode.r, resultCode.rd, data)
    }

    fun setResultData(result: String?, resultDesc: String?) {
        put("r", result)
        put("rd", resultDesc)
    }

    fun setResultData(result: String?, resultDesc: String?, data: Any?) {
        put("r", result)
        put("rd", resultDesc)
        put("data", data)
    }

    var data: Any?
        get() = get("data")
        set(data) {
            put("data", data)
        }
    val result: String?
        get() = get("r") as String?
    val resultDescription: String?
        get() = get("rd") as String?

    companion object {
        private const val serialVersionUID = 1456046014038813591L
    }
}