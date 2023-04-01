package com.example.alternasavings.data.api

import co.infinum.retromock.meta.Mock
import co.infinum.retromock.meta.MockResponse
import com.example.alternasavings.model.LoginResponse
import retrofit2.http.POST

interface MockAPiService {

    @Mock
    @MockResponse
    @MockResponse(body = "{\"token\":\"fhfjfjjfjfjfjf\", \"createdOn\":\"12/02/2023\" , \"expiresOn\":\"12/02/2023\"}")
    @POST("login")
    suspend fun login(email: String, password: String) : LoginResponse

}