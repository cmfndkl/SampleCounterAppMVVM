package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _counter = MutableLiveData(0)

    var counter: LiveData<String> = Transformations.map(_counter) {
        it.toString()
    }

    fun buttonClick() {
        _counter.value = _counter.value!! + 1
    }
}