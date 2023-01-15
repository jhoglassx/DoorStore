package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.dao.ProductDao
import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val productDao: ProductDao
) : LocalDataSource {
    override suspend fun insertProduct(productLocalEntity: ProductLocalEntity) {
        return productDao.insert(productLocalEntity)
    }
}
