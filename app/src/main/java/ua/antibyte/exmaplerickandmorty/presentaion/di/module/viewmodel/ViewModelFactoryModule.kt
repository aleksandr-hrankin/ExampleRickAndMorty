package ua.antibyte.exmaplerickandmorty.presentaion.di.module.viewmodel

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import ua.antibyte.exmaplerickandmorty.presentaion.viewmodel.factory.ViewModelFactory

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}