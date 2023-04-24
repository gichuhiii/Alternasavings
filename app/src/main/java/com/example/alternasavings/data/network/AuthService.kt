package com.example.alternasavings.data.network

import com.squareup.moshi.Json
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

data class RegisterRequestPayload(
    @Json(name = "name")
    val name: String,
    @Json(name = "id_number")
    val id_number: String,
    @Json(name = "dob")
    val dob: String,
    @Json(name = "gender")
    val gender: String,
    @Json(name = "phone")
    val phone: String,
    @Json(name = "email")
    val email: String,
)

data class LoginRequestPayload(
    @Json(name = "phone")
    val phone: String,
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
    @POST("login")
    fun login(@Body data: LoginRequestPayload): Call<LoginResponsePayload>

    @Headers("Content-Type: application/json")
    @POST("register")
    fun register(@Body data: RegisterRequestPayload): Call<LoginResponsePayload>
}