package com.example.buscarinformacion

import retrofit2.Call
import retrofit2.http.GET

interface Usuario {
    @GET("api/users/mojombo/repos")
    fun ObtenerRepos(): Call<ResultadoApi>
}