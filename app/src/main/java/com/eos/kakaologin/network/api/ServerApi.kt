package com.eos.kakaologin.network.api

import com.eos.kakaologin.network.body.send.StringBody
import retrofit2.Call
import retrofit2.http.GET

interface ServerApi {
    @GET("/")
    fun helloWorld(): Call<StringBody>
}