package com.example.alternasavings.data.api

import com.example.alternasavings.model.User
import com.example.alternasavings.data.repository.RegistrationRepository

//take in RegistrationRepository object allowing it to interact with the repository to create and retrieve user data
class RegistrationApi(private val registrationRepository: RegistrationRepository) {

    //method to register a new user into system and return a boolean value
    fun registerUser(
        fullName: String,
        nationalId: String,
        dateOfBirth: String,
        gender: String,
        email: String,
        phoneNumber: String
    ): Boolean {
        //create new User object
        val user = User(
            fullName = fullName,
            nationalId = nationalId,
            dateOfBirth = dateOfBirth,
            gender = gender,
            email = email,
            phoneNumber = phoneNumber
        )
        return registrationRepository.createUser(user)
    }

    //retrieve user data by id if user exists
    fun getUserById(userId: Int): User? {

        //passes userId and retrieves user object if it exists
        return registrationRepository.getUserById(userId)
    }

}
