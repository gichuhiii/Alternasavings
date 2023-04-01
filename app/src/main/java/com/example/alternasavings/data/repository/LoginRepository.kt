package com.example.alternasavings.data.repository

import com.example.alternasavings.data.api.MockAPiService
import com.example.alternasavings.model.User

//manages user authentication process
class LoginRepository(private val mockAPiService: MockAPiService) {

    private val users = mutableListOf<User>()
    //find user by email and password
    fun authenticateUserByEmail(email: String, password: String): User? {
        val user = users.find { it.email == email && it.password == password }
        return user
    }

    //find user by phone number and password
    fun authenticateUserByPhoneNumber(phoneNumber: String, password: String): User? {
        //add password in user data class
        val user = users.find { it.phoneNumber == phoneNumber && it.password == password }
        return user
    }

    suspend fun login(username: String, password: String) {
        mockAPiService.login(username, password)
    }
}
