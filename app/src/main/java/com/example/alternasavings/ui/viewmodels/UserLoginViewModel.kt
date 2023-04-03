package com.example.alternasavings.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alternasavings.data.api.UserLoginApi
import com.example.alternasavings.model.UserLoginPayload
import com.example.alternasavings.model.UserLoginResponse
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserLoginViewModel : ViewModel() {
    private val userLoginApi: UserLoginApi by lazy {
        Retrofit.Builder()
            .baseUrl("#")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserLoginApi::class.java)
    }

    //store result of login request
    private val _loginResult = MutableLiveData<Result<UserLoginResponse>>()
    val loginResult: LiveData<Result<UserLoginResponse>> = _loginResult


    fun loginUser(identifier: String, password: String) {
        viewModelScope.launch {
            try {
                val payload = UserLoginPayload(identifier, password)
                val response = userLoginApi.loginUser(payload)
                _loginResult.postValue(Result.success(response))
            } catch (e: Exception) {
                _loginResult.postValue(Result.failure(e))
            }
        }
    }
}
