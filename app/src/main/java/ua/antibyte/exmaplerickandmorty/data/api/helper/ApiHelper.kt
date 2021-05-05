package ua.antibyte.exmaplerickandmorty.data.api.helper

import ua.antibyte.exmaplerickandmorty.domain.model.dto.LocationsResponse
import ua.antibyte.exmaplerickandmorty.domain.model.dto.PersonsResponse

interface ApiHelper {
    suspend fun getAllPersons(): PersonsResponse

    suspend fun getAllLocations(): LocationsResponse
}