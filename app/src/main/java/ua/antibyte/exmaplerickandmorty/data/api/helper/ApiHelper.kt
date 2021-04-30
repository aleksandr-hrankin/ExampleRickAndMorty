package ua.antibyte.exmaplerickandmorty.data.api.helper

import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse

interface ApiHelper {
    suspend fun getAllPersons(): PersonsResponse
}