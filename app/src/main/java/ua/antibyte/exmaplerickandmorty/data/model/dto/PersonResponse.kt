package ua.antibyte.exmaplerickandmorty.data.model.dto

import com.google.gson.annotations.SerializedName

data class PersonResponse(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String
)