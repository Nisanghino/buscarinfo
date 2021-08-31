package com.example.buscarinformacion

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retofit {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}