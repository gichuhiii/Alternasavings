package com.example.alternasavings.data.network

import com.squareup.moshi.Json
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

data class RegisterRequestPayload(
    @Json(name = "fullName")
    val fullName: String,
    @Json(name = "idNumber")
    val idNumber: String,
    @Json(name = "dateOfBirth")
    val dateOfBirth: String,
    @Json(name = "gender")
    val gender: String,
    @Json(name = "phoneNumber")
    val phoneNumber: String,
    @Json(name = "email")
    val email: String,
)

data class LoginRequestPayload(
    @Json(name = "phoneNumber")
    val phoneNumber: String,
    @Json(name = "pin")
    val pin: String,
)

//  Gives us the response
data class LoginResponsePayload(
    @Json(name = "access_token")
    val access_token: String
)

interface AuthService {
    @Headers("Content-Type: application/json")
    @POST("user/login")
    fun login(@Body data: LoginRequestPayload): Call<LoginResponsePayload>

    @Headers("Content-Type: application/json")
    @POST("user/signup")
    fun register(@Body data: RegisterRequestPayload): Call<LoginResponsePayload>
}