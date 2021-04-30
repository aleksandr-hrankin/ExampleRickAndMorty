package ua.antibyte.exmaplerickandmorty.domain.usecase

import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse
import ua.antibyte.exmaplerickandmorty.data.repository.Repository

class GetAllPersonsUseCase(private val repository: Repository) : BaseUseCase<PersonsResponse>() {
    override suspend fun getSuspend(): PersonsResponse {
        return repository.getAllPersons()
    }
}