package com.example.buscarinformacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var cliente = retrofit.create(ServicioUsuario::class.java)

        var call = cliente.obtenerRepos("mojombo")
        call.enqueue(object: Callback<List<Repo>>{
            override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {
                if (response.isSuccessful) {
                    var lista = response.body()
                    if (lista == null) {
                        throw IllegalStateException("La respuesta no tiene datos")
                    } else {
                        for (i in lista)
                            Log.i("name", i.name)
                            Log.i("description", i.description)
                            Log.i("lenguage", i.language)
                            Log.i("url", i.url)

                    }
                   // Log.d("Ya Entiendo", response.toString())
                }
            //   "response.code() = ${response.code()}"
            // TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
                Log.d ("Ya Entiendo", "hubo error", t)
            }

        })



    }
}