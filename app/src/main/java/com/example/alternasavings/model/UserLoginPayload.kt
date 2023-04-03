package com.example.alternasavings.model

data class UserLoginPayload(
    //identifier depending on whether a user will use email or phone no. to login
    val identifier: String,
    val password: String
)
