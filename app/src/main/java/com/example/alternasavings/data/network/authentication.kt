package com.example.alternasavings.data.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object ApiClients {

    private const val LOGIN_BASE_URL = "http://10.20.33.97:8080/user/login"
    private const val REGISTRATION_BASE_URL = "http://10.20.33.97:8080/user/signup"

    private val httpClient = OkHttpClient.Builder().build()

    private val loginRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(LOGIN_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }

    private val registrationRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(REGISTRATION_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .build()
    }

//    val userRegistrationApi = registrationRetrofit.create(UserRegistrationApi::class.java)
//    val userLoginApi: UserLoginApi = loginRetrofit.create(UserLoginApi::class.java)

}
