package ua.antibyte.exmaplerickandmorty.data.repository

import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelper
import ua.antibyte.exmaplerickandmorty.data.model.dto.LocationsResponse
import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse

class RepositoryImpl(private val apiHelper: ApiHelper) : Repository {
    override suspend fun getAllPersons(): PersonsResponse {
        return apiHelper.getAllPersons()
    }

    override suspend fun getAllLocations(): LocationsResponse {
        return apiHelper.getAllLocations()
    }
}