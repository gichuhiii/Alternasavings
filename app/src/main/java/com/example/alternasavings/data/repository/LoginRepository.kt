package com.example.alternasavings.data.repository

import com.example.alternasavings.data.api.MockAPiService
import com.example.alternasavings.data.api.UserLoginApi
import com.example.alternasavings.model.UserLoginPayload
import com.example.alternasavings.model.UserLoginResponse

//manages user authentication process
//class LoginRepository(private val mockAPiService: MockAPiService) {
//    suspend fun login(username: String, password: String) {
//        mockAPiService.login(username, password)
//    }
//}

class LoginRepository(private val userLoginApi: UserLoginApi) {

    suspend fun loginUser(
        password: String,
        phoneNumber: String
    ): Result<UserLoginResponse> {
        val payload = UserLoginPayload(
          phoneNumber = phoneNumber,
            password = password
        )

        return try {
            val response = userLoginApi.loginUser(payload)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

