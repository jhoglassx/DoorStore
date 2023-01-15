package com.jgenesis.doorstore.data.repository

import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity

interface Repository {

    suspend fun loadProduct(): List<ProductRemoteEntity>?
}
