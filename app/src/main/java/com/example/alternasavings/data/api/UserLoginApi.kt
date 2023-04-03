package com.example.alternasavings.data.api

import com.example.alternasavings.model.UserLoginPayload
import com.example.alternasavings.model.UserLoginResponse
import retrofit2.http.Body
import retrofit2.http.POST


interface UserLoginApi {
    @POST("login")
    //method takes in the payload object and returns the response object
    suspend fun loginUser(@Body payload: UserLoginPayload): UserLoginResponse
}
