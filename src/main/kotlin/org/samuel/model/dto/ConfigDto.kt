package org.samuel.model.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ConfigDto(
    @field:JsonProperty("id")
    val id: String? = null,

    @field:JsonProperty("key")
    val key: String? = null
)

data class ConfigResultDto(
    @field:JsonProperty("config")
    val config: String? = null,
)