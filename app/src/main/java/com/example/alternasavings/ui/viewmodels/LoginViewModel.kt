package com.example.alternasavings.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alternasavings.data.repository.LoginRepository
import com.example.alternasavings.model.LoginResponse
import kotlinx.coroutines.launch

class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {
    private val _loginResult = MutableLiveData<Result<LoginResponse>>()
    val loginResult: LiveData<Result<LoginResponse>> = _loginResult

    fun login(phoneNumber: String, password: String) {
        viewModelScope.launch {
            val result = loginRepository.login(phoneNumber, password)
            _loginResult.value = result
        }
    }
}