package ua.antibyte.exmaplerickandmorty.presentaion.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import ua.antibyte.exmaplerickandmorty.common.utils.Resource
import ua.antibyte.exmaplerickandmorty.data.repository.Repository

class PersonsViewModel(private val repository: Repository) : ViewModel() {
    fun getAllPersons() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = repository.getAllPersons()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}