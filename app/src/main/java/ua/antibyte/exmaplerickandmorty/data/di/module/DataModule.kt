package ua.antibyte.exmaplerickandmorty.data.di.module

import dagger.Module
import dagger.Provides
import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelper
import ua.antibyte.exmaplerickandmorty.data.mapper.Mapper
import ua.antibyte.exmaplerickandmorty.data.mapper.MapperImpl
import ua.antibyte.exmaplerickandmorty.data.repository.Repository
import ua.antibyte.exmaplerickandmorty.data.repository.RepositoryImpl
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class DataModule {
    @Provides
    @Singleton
    fun provideMapper(): Mapper {
        return MapperImpl()
    }

    @Provides
    @Singleton
    fun provideRepository(apiHelper: ApiHelper, mapper: Mapper): Repository {
        return RepositoryImpl(apiHelper, mapper)
    }
}