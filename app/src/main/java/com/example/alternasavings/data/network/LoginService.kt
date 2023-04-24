package com.example.alternasavings.data.network

import com.example.alternasavings.model.LoginPayload
import com.example.alternasavings.model.LoginResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("login")
    suspend fun login(@Body request: LoginPayload): Response <LoginResponse>

    object ApiClient {
       private const val BASE_URL = "http://10.20.33.73:8080/user/login"

        private val retrofit: Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val LoginService: LoginService by lazy {
            retrofit.create(LoginService::class.java)
        }

    }
}