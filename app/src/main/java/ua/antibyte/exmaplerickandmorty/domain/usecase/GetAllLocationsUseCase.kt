package ua.antibyte.exmaplerickandmorty.domain.usecase

import ua.antibyte.exmaplerickandmorty.data.model.dto.LocationsResponse
import ua.antibyte.exmaplerickandmorty.data.repository.Repository

class GetAllLocationsUseCase(private val repository: Repository) : BaseUseCase<LocationsResponse>() {
    override suspend fun getSuspend(): LocationsResponse {
        return repository.getAllLocations()
    }
}