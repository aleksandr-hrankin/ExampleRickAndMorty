package ua.antibyte.exmaplerickandmorty.data.mapper

import ua.antibyte.exmaplerickandmorty.domain.model.dto.LocationResponse
import ua.antibyte.exmaplerickandmorty.domain.model.dto.PersonResponse
import ua.antibyte.exmaplerickandmorty.domain.model.enity.LocationPlace
import ua.antibyte.exmaplerickandmorty.domain.model.enity.Person

interface Mapper {
    fun mapPersonDtoToEntity(personResponse: PersonResponse): Person

    fun mapLocationDtoToEntity(locationResponse: LocationResponse): LocationPlace
}