package com.example.noiseperiodtracker.ui.newdatum

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewDatumViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is new datum Fragment"
    }
    val text: LiveData<String> = _text
}