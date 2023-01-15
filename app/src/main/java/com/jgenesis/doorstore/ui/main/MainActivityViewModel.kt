package com.jgenesis.doorstore.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jgenesis.doorstore.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    fun load() {
        viewModelScope.launch {
            val product = repository.loadProduct()
            Log.i("LOAD PRODUCT", "$product")
        }
    }
}
