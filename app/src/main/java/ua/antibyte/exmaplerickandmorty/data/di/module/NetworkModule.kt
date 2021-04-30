package ua.antibyte.exmaplerickandmorty.data.di.module

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ua.antibyte.exmaplerickandmorty.data.Constants.BASE_URL
import ua.antibyte.exmaplerickandmorty.data.api.ApiService
import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelper
import ua.antibyte.exmaplerickandmorty.data.api.helper.ApiHelperImpl
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideApiHelper(apiService: ApiService): ApiHelper {
        return ApiHelperImpl(apiService)
    }
}