package com.example.buscarinformacion

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServicioUsuario {
    @GET("users/{user}/repos")
    fun obtenerRepos(@Path("user") user:String): Call<List<Repo> >
}