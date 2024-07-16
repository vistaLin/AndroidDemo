package com.example.databinding
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBindingViewModel : ViewModel() {
    private val _someText = MutableLiveData("Hello, World!")
    val someText: LiveData<String> get() = _someText

    fun onButtonClicked() {
        _someText.value = "Button clicked!"
    }
}