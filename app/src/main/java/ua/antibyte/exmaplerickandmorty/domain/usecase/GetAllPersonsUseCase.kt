package ua.antibyte.exmaplerickandmorty.domain.usecase

import ua.antibyte.exmaplerickandmorty.data.repository.Repository
import ua.antibyte.exmaplerickandmorty.domain.model.enity.Person

class GetAllPersonsUseCase(private val repository: Repository) : BaseUseCase<List<Person>>() {
    override suspend fun getSuspend(): List<Person> {
        return repository.getAllPersons()
    }
}