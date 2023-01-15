package com.jgenesis.doorstore.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jgenesis.doorstore.data.mappers.ProductMapper
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
            val products = repository.loadProduct()
            products?.forEach {
                repository.insertProduct(ProductMapper.domainToLocal(it))
            }

            Log.i("LOAD PRODUCT", "$products")
        }
    }
}
