package com.example.alternasavings.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alternasavings.data.repository.LoginRepository
import kotlinx.coroutines.launch

class MainViewModel(private var repository: LoginRepository) : ViewModel(){

    fun login(phoneNumber: String, password: String){
        viewModelScope.launch {
            repository.loginUser(phoneNumber, password)
        }
    }
}