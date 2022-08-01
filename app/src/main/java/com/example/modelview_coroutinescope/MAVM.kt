package com.example.modelview_coroutinescope

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MAVM: ViewModel(){
                        // Was Ist Job
    private val myJob = Job()
    private val myScope = CoroutineScope(Dispatchers.IO + myJob)

    fun getUserData(){
        myScope.launch {
            // Write something hier
        }

    }

    override fun onCleared() {
        super.onCleared()
        myJob.cancel()
    }
    
}