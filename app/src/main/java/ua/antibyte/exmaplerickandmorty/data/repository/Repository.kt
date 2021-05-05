package ua.antibyte.exmaplerickandmorty.data.repository

import ua.antibyte.exmaplerickandmorty.domain.model.enity.LocationPlace
import ua.antibyte.exmaplerickandmorty.domain.model.enity.Person

interface Repository {
    suspend fun getAllPersons(): List<Person>
    suspend fun getAllLocations(): List<LocationPlace>
}