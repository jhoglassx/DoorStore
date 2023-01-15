package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity

interface LocalDataSource {
    suspend fun insertProduct(productLocalEntity: ProductLocalEntity)
}
