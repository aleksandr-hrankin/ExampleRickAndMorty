package ua.antibyte.exmaplerickandmorty.domain.model.dto

import com.google.gson.annotations.SerializedName

data class LocationResponse(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String
)