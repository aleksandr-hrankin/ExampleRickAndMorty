package ua.antibyte.exmaplerickandmorty.data.api.service

import retrofit2.http.GET
import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse

interface ApiService {
    @GET("api/character")
    suspend fun getAllPersons(): PersonsResponse
}