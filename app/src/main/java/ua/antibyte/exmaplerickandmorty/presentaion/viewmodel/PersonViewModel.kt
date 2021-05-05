package ua.antibyte.exmaplerickandmorty.presentaion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ua.antibyte.exmaplerickandmorty.common.utils.Resource
import ua.antibyte.exmaplerickandmorty.domain.model.enity.Person
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllPersonsUseCase
import javax.inject.Inject

class PersonViewModel @Inject constructor(private val getAllPersonsUseCase: GetAllPersonsUseCase) :
    ViewModel() {
    fun getAllPersons(): LiveData<Resource<List<Person>>> {
        return getAllPersonsUseCase.execute()
    }
}