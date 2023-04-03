package com.example.alternasavings.data.network

import com.example.alternasavings.data.api.UserLoginApi
import com.example.alternasavings.data.api.UserRegistrationApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object ApiClient {
    private const val LOGIN_BASE_URL = "http://localhost:8080/user/login"
    private const val REGISTRATION_BASE_URL = "http://localhost:8080/user/signup"

    private val loginRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(LOGIN_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val registrationRetrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(REGISTRATION_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val userRegistrationApi = registrationRetrofit.create(UserRegistrationApi::class.java)
    private val userLoginApi = loginRetrofit.create(UserLoginApi::class.java)

}
