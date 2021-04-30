package ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelper
import ua.antibyte.exmaplerickandmorty.data.repository.RepositoryImpl
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllLocationsUseCase
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllPersonsUseCase
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.LocationViewModel
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.PersonsViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PersonsViewModel::class.java)) {
            return PersonsViewModel(GetAllPersonsUseCase(RepositoryImpl(apiHelper))) as T
        } else if (modelClass.isAssignableFrom(LocationViewModel::class.java)) {
            return LocationViewModel(GetAllLocationsUseCase(RepositoryImpl(apiHelper))) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}