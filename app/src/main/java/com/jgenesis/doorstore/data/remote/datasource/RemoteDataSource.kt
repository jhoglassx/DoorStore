package com.jgenesis.doorstore.data.remote.datasource

import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity

interface RemoteDataSource {
    suspend fun getProducts(): List<ProductRemoteEntity>?
}
