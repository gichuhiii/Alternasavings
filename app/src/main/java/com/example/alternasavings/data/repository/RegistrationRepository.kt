package com.example.alternasavings.data.repository

import com.example.alternasavings.data.network.RegisterService
import com.example.alternasavings.model.RegistrationPayload
import com.example.alternasavings.model.RegistrationResponse

class RegistrationRepository(private val registerService: RegisterService) {

    suspend fun registerUser(
        fullName: String,
        idNumber: String,
        dateOfBirth: String,
        gender: String,
        phoneNumber: String,
        email: String
    ): RegistrationResponse? {
        val registrationRequest = RegistrationPayload(
            fullName = fullName,
            idNumber = idNumber,
            dateOfBirth = dateOfBirth,
            gender = gender,
            phoneNumber = phoneNumber,
            email = email
        )

        return try {
            registerService.registerUser(registrationRequest)
        } catch (e: Exception) {
            null
        }
    }
}