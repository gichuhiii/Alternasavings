package com.example.alternasavings.data.api

import android.util.Patterns
import com.example.alternasavings.model.User
import com.example.alternasavings.data.repository.LoginRepository

class LoginApi(private val loginRepository: LoginRepository) {

    fun loginUser(identifier: String, password: String): User? {

        //when checks if identifier matches either email or phone number
        return when {
            //if email matches, call authenticateUserByEmail method
            Patterns.EMAIL_ADDRESS.matcher(identifier).matches() ->
                loginRepository.authenticateUserByEmail(identifier, password)

            //if phone number matches, call authenticateUserByPhoneNumber method
            Patterns.PHONE.matcher(identifier).matches() ->
                loginRepository.authenticateUserByPhoneNumber(identifier, password)
            else -> null
        }
    }
}
