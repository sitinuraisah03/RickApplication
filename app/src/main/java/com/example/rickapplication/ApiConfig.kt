package com.example.rickapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiConfig {
    const val baseURL = "https://rickandmortyapi.com/api/"

    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService(): ApiSevice{
        return getRetrofit().create(ApiSevice::class.java)
    }
}