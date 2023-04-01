package com.example.alternasavings.model

//contains user properties
data class User(
    var id: Int = 0,
    val fullName: String,
    val nationalId: String,
    val dateOfBirth: String,
    val gender: String,
    val email: String,
    val phoneNumber: String
)
