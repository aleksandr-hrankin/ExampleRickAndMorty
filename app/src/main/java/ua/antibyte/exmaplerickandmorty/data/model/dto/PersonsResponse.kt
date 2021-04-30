package ua.antibyte.exmaplerickandmorty.data.model.dto

import com.google.gson.annotations.SerializedName

data class PersonsResponse(
    @SerializedName("info")
    val info: PersonsInfoResponse,

    @SerializedName("results")
    val results: List<PersonResponse>
)