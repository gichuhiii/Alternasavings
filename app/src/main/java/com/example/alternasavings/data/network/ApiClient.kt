package com.example.alternasavings.data.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

//to call API service
object ApiClient {
    //  Get URL
    private const val BASE_URL = "http://10.20.33.73:8080/"

    //  Create variable for Moshi builder and add converter
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    // Create instance of Retrofit by lazy so it can be initialized only when needed
    private val retrofit: Retrofit by lazy {
        //build with Retrofit
        Retrofit.Builder()
            //pass base URL and Moshi variables
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    val authService: AuthService by lazy {
        retrofit.create(AuthService::class.java)
    }
}