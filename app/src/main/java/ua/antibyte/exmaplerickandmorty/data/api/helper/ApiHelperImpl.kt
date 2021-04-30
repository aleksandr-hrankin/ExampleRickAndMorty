package ua.antibyte.exmaplerickandmorty.data.api.helper

import ua.antibyte.exmaplerickandmorty.data.api.service.ApiService
import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getAllPersons(): PersonsResponse {
        return apiService.getAllPersons()
    }
}