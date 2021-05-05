package ua.antibyte.exmaplerickandmorty.data.repository

import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelper
import ua.antibyte.exmaplerickandmorty.data.mapper.Mapper
import ua.antibyte.exmaplerickandmorty.domain.model.enity.LocationPlace
import ua.antibyte.exmaplerickandmorty.domain.model.enity.Person

class RepositoryImpl(private val apiHelper: ApiHelper, private val mapper: Mapper) : Repository {
    override suspend fun getAllPersons(): List<Person> {
        val personsResponse = apiHelper.getAllPersons()
        return personsResponse.results.map { mapper.mapPersonDtoToEntity(it) }
    }

    override suspend fun getAllLocations(): List<LocationPlace> {
        val locationsResponse = apiHelper.getAllLocations()
        return locationsResponse.results.map { mapper.mapLocationDtoToEntity(it) }
    }
}