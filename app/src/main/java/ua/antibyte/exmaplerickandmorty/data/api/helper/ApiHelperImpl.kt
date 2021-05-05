package ua.antibyte.exmaplerickandmorty.data.api.helper

import ua.antibyte.exmaplerickandmorty.data.api.ApiService
import ua.antibyte.exmaplerickandmorty.domain.model.dto.LocationsResponse
import ua.antibyte.exmaplerickandmorty.domain.model.dto.PersonsResponse

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getAllPersons(): PersonsResponse {
        return apiService.getAllPersons()
    }

    override suspend fun getAllLocations(): LocationsResponse {
        return apiService.getAllLocations()
    }
}