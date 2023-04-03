package com.example.alternasavings.data.repository

import com.example.alternasavings.data.api.MockAPiService

//manages user authentication process
class LoginRepository(private val mockAPiService: MockAPiService) {
    suspend fun login(username: String, password: String) {
        mockAPiService.login(username, password)
    }
}

//class UserLoginRepository(private val userLoginApi: UserLoginApi) {
//
//    suspend fun loginUser(
//        email: String,
//        password: String
//    ): Result<UserLoginResponse> {
//        val payload = UserLoginPayload(
//            email = email,
//            password = password
//        )
//
//        return try {
//            val response = userLoginApi.loginUser(payload)
//            Result.success(response)
//        } catch (e: Exception) {
//            Result.failure(e)
//        }
//    }
//}

