package com.eos.kakaologin.network.body

import android.app.Activity
import com.eos.kakaologin.network.api.ServerApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "http://172.16.162.62:8080"

    private val instance = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()).build().create(ServerApi::class.java)

    fun Activity.helloWorld() = instance.helloWorld()
}