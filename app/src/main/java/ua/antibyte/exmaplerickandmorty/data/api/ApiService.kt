package ua.antibyte.exmaplerickandmorty.data.api

import retrofit2.http.GET
import ua.antibyte.exmaplerickandmorty.domain.model.dto.LocationsResponse
import ua.antibyte.exmaplerickandmorty.domain.model.dto.PersonsResponse

interface ApiService {
    @GET("api/character")
    suspend fun getAllPersons(): PersonsResponse

    @GET("api/location")
    suspend fun getAllLocations(): LocationsResponse
}