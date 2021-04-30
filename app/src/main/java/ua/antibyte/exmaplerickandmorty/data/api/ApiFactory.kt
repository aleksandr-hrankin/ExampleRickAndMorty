package ua.antibyte.exmaplerickandmorty.data.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ua.antibyte.exmaplerickandmorty.data.api.service.ApiService

object ApiFactory {
    private const val BASE_URL = "https://rickandmortyapi.com/"

    fun createApiService(): ApiService {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService::class.java)
    }
}