package com.example.infoapp.ui.infopersonal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfoPersonalViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Informações pessoal do Renato Nunes"
    }
    val text: LiveData<String> = _text
}