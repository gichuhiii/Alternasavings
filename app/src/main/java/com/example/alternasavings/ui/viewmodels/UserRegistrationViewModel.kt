package com.example.alternasavings.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alternasavings.data.api.UserRegistrationApi
import com.example.alternasavings.model.UserRegistrationPayload
import com.example.alternasavings.model.UserRegistrationResponse
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserRegistrationViewModel : ViewModel() {
    private val userRegistrationApi: UserRegistrationApi by lazy {
        Retrofit.Builder()
            .baseUrl("#")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserRegistrationApi::class.java)
    }

    //store result of registration request
    private val _registrationResult = MutableLiveData<Result<UserRegistrationResponse>>()
    val registrationResult: LiveData<Result<UserRegistrationResponse>> = _registrationResult

    fun registerUser(payload: UserRegistrationPayload) {
        viewModelScope.launch {
            try {
                val response = userRegistrationApi.registerUser(payload)
                _registrationResult.postValue(Result.success(response))
            } catch (e: Exception) {
                _registrationResult.postValue(Result.failure(e))
            }
        }
    }
}
