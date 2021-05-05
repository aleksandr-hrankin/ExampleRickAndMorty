package ua.antibyte.exmaplerickandmorty.domain.model.dto

import com.google.gson.annotations.SerializedName

data class PersonsResponse(
    @SerializedName("info")
    val info: InfoResponse,

    @SerializedName("results")
    val results: List<PersonResponse>
)