package com.example.alternasavings.data.network

import com.example.alternasavings.data.api.LoginApi
import com.example.alternasavings.data.api.RegistrationApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    //add link for API
    private const val BASE_URL = "#"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //create instance of LoginApi and RegistrationApi interfaces respectively
    val registrationApi: RegistrationApi by lazy {
        retrofit.create(RegistrationApi::class.java)
    }

    val loginApi: LoginApi by lazy {
        retrofit.create(LoginApi::class.java)
    }
}
