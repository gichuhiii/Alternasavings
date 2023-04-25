package com.example.alternasavings.data.network

import com.example.alternasavings.model.RegistrationPayload
import com.example.alternasavings.model.RegistrationResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterService {
    @POST("register")
    suspend fun registerUser(@Body request: RegistrationPayload): RegistrationResponse

    object ApiClient {
        private const val BASE_URL = "http://10.20.33.73:8080/user/signup"

        private val retrofit: Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val registerService: RegisterService by lazy {
            retrofit.create(RegisterService::class.java)
        }
    }
}