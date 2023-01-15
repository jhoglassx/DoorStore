package com.jgenesis.doorstore.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jgenesis.doorstore.data.mappers.*
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
            val clients = repository.loadClient()
            val buys = repository.loadBuy()
            val sells = repository.loadSell()
            products?.forEach {
                repository.insertProduct(ProductMapper.domainToLocal(it))
            }

            Log.i("LOAD PRODUCT", "$products")

            clients?.forEach {
                repository.insertClient(ClientMapper.domainToLocal(it))
            }

            Log.i("LOAD CLIENTS", "$clients")

            buys?.forEach {
                repository.insertBuy(BuyMapper.domainToLocal(it))
            }

            Log.i("LOAD BUYS", "$buys")

            sells?.forEach { sell ->
                repository.insertSell(SellMapper.domainToLocal(sell))
                sell.products.forEach { product ->
                    repository.insertSellProduct(SellProductMapper.domainToLocal(product, sell.id))
                }
            }

            Log.i("LOAD SELL", "$sells")

            val sellsCrossRef = repository.getSellAll()
            Log.i("SELL", "$sellsCrossRef")
        }
    }
}
