package com.google.firebase.quickstart.auth.livedatasample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

     var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun updatedCount(){
        count.value = count.value?.plus(1)
    }
}