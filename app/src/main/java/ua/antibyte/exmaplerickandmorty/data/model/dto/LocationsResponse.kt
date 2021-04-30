package ua.antibyte.exmaplerickandmorty.data.model.dto

import com.google.gson.annotations.SerializedName

data class LocationsResponse(
    @SerializedName("info")
    val info: InfoResponse,

    @SerializedName("results")
    val results: List<LocationResponse>
)