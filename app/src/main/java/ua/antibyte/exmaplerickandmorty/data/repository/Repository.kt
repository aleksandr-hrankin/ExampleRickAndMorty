package ua.antibyte.exmaplerickandmorty.data.repository

import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse

interface Repository{
    suspend fun getAllPersons(): PersonsResponse
}