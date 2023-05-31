package com.example.rickapplication

import retrofit2.Call
import retrofit2.http.GET

interface ApiSevice {
    @GET("character")
    fun  getrick(): Call<ResponseRick>
}