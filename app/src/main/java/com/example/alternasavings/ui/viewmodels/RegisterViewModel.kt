package com.example.alternasavings.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.alternasavings.data.repository.RegistrationRepository
import com.example.alternasavings.model.RegistrationResponse
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alternasavings.data.network.RegisterService.ApiClient.registerService
import com.example.alternasavings.model.RegistrationPayload
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RegisterViewModel : ViewModel() {

    private val _registrationResponse = MutableLiveData<RegistrationResponse>()
    val registrationResponse: LiveData<RegistrationResponse> get() = _registrationResponse

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String>
        get() = _errorMessage

    fun registerUser(fullName: String, idNumber: String, dob: String, gender: String, phoneNumber: String, email: String) {
        viewModelScope.launch {
            try {
                val response = withContext(Dispatchers.IO) {
                    registerService.registerUser(RegistrationPayload(fullName, idNumber, dob, gender, phoneNumber, email))
                }
                _registrationResponse.value = response
            } catch (e: Exception) {
                _errorMessage.value = e.message
            }
        }
    }
}