package com.example.infoapp.ui.infoworking

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfoWorkingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = mutableListOf(
            "Mobile Develop",
            "Kotlin Develop",
            "Java Develop",
            "WEB Develop",
            "CSS 3",
            "HTML 5",
            "Javascrips",
            "PHP Laravel",
            "Bootstrap",
        ).toString()
    }
    val text: LiveData<String> = _text
}