package ua.antibyte.exmaplerickandmorty.domain.usecase

import ua.antibyte.exmaplerickandmorty.data.repository.Repository
import ua.antibyte.exmaplerickandmorty.domain.model.enity.LocationPlace

class GetAllLocationsUseCase(private val repository: Repository) : BaseUseCase<List<LocationPlace>>() {
    override suspend fun getSuspend(): List<LocationPlace> {
        return repository.getAllLocations()
    }
}