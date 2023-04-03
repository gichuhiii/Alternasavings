package com.example.alternasavings.data.api

import com.example.alternasavings.model.UserRegistrationPayload
import com.example.alternasavings.model.UserRegistrationResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface UserRegistrationApi {
    @POST("register")
    //method takes in the payload object and returns the response object
    suspend fun registerUser(@Body payload: UserRegistrationPayload): UserRegistrationResponse
}