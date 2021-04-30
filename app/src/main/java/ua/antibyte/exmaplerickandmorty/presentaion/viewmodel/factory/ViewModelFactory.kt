package ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelper
import ua.antibyte.exmaplerickandmorty.data.repository.RepositoryImpl
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllLocationsUseCase
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllPersonsUseCase
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.LocationViewModel
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.PersonViewModel
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class ViewModelFactory @Inject constructor(
    private val viewModels: MutableMap<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = viewModels[modelClass] ?: viewModels.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw IllegalArgumentException("Unknown model class $modelClass")
        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}