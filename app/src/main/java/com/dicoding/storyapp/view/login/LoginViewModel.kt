package com.dicoding.storyapp.view.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.storyapp.data.UserRepository
import com.dicoding.storyapp.data.preference.UserModel
import com.dicoding.storyapp.data.response.LoginResponse

class LoginViewModel(private val repository: UserRepository) : ViewModel() {
    var loginResult : MutableLiveData<LoginResponse> = repository.loginResult
    var isLoading: LiveData<Boolean> = repository.isLoading

    fun login(email: String, password: String) {
        return repository.login(email, password)
    }

    suspend fun saveSession(user: UserModel) {
        repository.saveSession(user)
    }
}