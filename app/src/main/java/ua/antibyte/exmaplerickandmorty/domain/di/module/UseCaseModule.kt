package ua.antibyte.exmaplerickandmorty.domain.di.module

import dagger.Module
import dagger.Provides
import ua.antibyte.exmaplerickandmorty.data.repository.Repository
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllLocationsUseCase
import ua.antibyte.exmaplerickandmorty.domain.usecase.GetAllPersonsUseCase
import javax.inject.Singleton

@Module
class UseCaseModule {
    @Provides
    @Singleton
    fun provideGetAllPersonsUseCase(repository: Repository): GetAllPersonsUseCase {
        return GetAllPersonsUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetAllLocationsUseCase(repository: Repository): GetAllLocationsUseCase {
        return GetAllLocationsUseCase(repository)
    }
}