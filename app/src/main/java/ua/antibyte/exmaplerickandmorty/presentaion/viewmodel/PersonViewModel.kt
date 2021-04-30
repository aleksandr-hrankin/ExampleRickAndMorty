package ua.antibyte.exmaplerickandmorty.presentaion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ua.antibyte.exmaplerickandmorty.common.utils.Resource
import ua.antibyte.exmaplerickandmorty.data.model.dto.PersonsResponse
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllPersonsUseCase
import javax.inject.Inject

class PersonViewModel @Inject constructor(private val getAllPersonsUseCase: GetAllPersonsUseCase) :
    ViewModel() {
    fun getAllPersons(): LiveData<Resource<PersonsResponse>> {
        return getAllPersonsUseCase.execute()
    }
}