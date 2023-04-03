package com.example.alternasavings.data.repository

import com.example.alternasavings.data.api.UserRegistrationApi
import com.example.alternasavings.model.UserRegistrationPayload
import com.example.alternasavings.model.UserRegistrationResponse

//takes in a UserRegistrationApi instance as its constructor parameter, the UserRegistrationApi interface is used to define the API endpoints for user registration
class UserRegistrationRepository(private val userRegistrationApi: UserRegistrationApi) {

    //define the method that will take in the user registration data
    suspend fun registerUser(
        fullName: String,
        nationalIdNumber: String,
        dateOfBirth: String,
        gender: String,
        phoneNumber: String,
        email: String
    ): Result<UserRegistrationResponse> {
        //create a payload object that will be sent to the API
        val payload = UserRegistrationPayload(
            fullname = fullName,
            nationalIdNumber = nationalIdNumber,
            dateOfBirth = dateOfBirth,
            gender = gender,
            phoneNumber = phoneNumber,
            email = email
        )

        //make API call using the payload object and return the response
        //try block to catch any exceptions that may occur
        return try {
            val response = userRegistrationApi.registerUser(payload)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
