package ua.antibyte.exmaplerickandmorty.presentaion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ua.antibyte.exmaplerickandmorty.common.utils.Resource
import ua.antibyte.exmaplerickandmorty.domain.model.enity.LocationPlace
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllLocationsUseCase
import javax.inject.Inject

class LocationPlaceViewModel @Inject constructor(private val getAllLocationsUseCase: GetAllLocationsUseCase) : ViewModel() {
    fun getAllLocations(): LiveData<Resource<List<LocationPlace>>> {
        return getAllLocationsUseCase.execute()
    }
}