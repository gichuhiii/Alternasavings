package com.example.alternasavings.data.repository

import com.example.alternasavings.model.User

class RegistrationRepository {

    //create private list of User objects
    private val users = mutableListOf<User>()
    private var nextUserId = 1

    //function to create new user in the system
    fun createUser(user: User): Boolean {

        //checks if user with similar email or phone number exists
        if (users.any { it.email == user.email || it.phoneNumber == user.phoneNumber }) {
            return false // phone no. or email already exists
        }
        //assigns id to new user object and adds user to registered users list
        user.id = nextUserId++
        users.add(user)

        //returns true to show successful registration
        return true
    }

    //retrieve user data by id if user exists
    fun getUserById(userId: Int): User? {
        return users.find { it.id == userId }
    }

}
