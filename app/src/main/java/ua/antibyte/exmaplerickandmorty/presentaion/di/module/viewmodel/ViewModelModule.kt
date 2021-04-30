package ua.antibyte.exmaplerickandmorty.presentaion.di.module.viewmodel

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ua.antibyte.exmaplerickandmorty.common.di.annotation.ViewModelKey
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.LocationViewModel
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.PersonViewModel

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PersonViewModel::class)
    internal abstract fun providePersonsViewModel(viewModel: PersonViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LocationViewModel::class)
    internal abstract fun provideLocationsViewModel(viewModel: LocationViewModel): ViewModel
}