package com.jgenesis.doorstore.data.remote.datasource

import com.jgenesis.doorstore.data.remote.entity.BuyRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ClientRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.SellRemoteEntity

interface RemoteDataSource {
    suspend fun getProducts(): List<ProductRemoteEntity>?
    suspend fun getClients(): List<ClientRemoteEntity>?
    suspend fun getBuys(): List<BuyRemoteEntity>?
    suspend fun getSells(): List<SellRemoteEntity>?
}
