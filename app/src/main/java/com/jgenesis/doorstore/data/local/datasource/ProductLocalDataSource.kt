package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity

interface ProductLocalDataSource {
    suspend fun insertProduct(productLocalEntity: ProductLocalEntity)
}
