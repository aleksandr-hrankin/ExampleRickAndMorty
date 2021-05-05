package ua.antibyte.exmaplerickandmorty.data.mapper

import ua.antibyte.exmaplerickandmorty.domain.model.dto.LocationResponse
import ua.antibyte.exmaplerickandmorty.domain.model.dto.PersonResponse
import ua.antibyte.exmaplerickandmorty.domain.model.enity.LocationPlace
import ua.antibyte.exmaplerickandmorty.domain.model.enity.Person

class MapperImpl : Mapper {
    override fun mapPersonDtoToEntity(personResponse: PersonResponse): Person {
        return Person(
                personResponse.id,
                personResponse.name
        )
    }

    override fun mapLocationDtoToEntity(locationResponse: LocationResponse): LocationPlace {
        return LocationPlace(
                locationResponse.id,
                locationResponse.name
        )
    }
}