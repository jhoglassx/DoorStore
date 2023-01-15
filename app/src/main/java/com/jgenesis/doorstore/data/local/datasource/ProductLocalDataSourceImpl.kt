package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.dao.ProductDao
import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity
import javax.inject.Inject

class ProductLocalDataSourceImpl @Inject constructor(
    private val productDao: ProductDao
) : ProductLocalDataSource {
    override suspend fun insertProduct(
        productLocalEntity: ProductLocalEntity
    ) = productDao.insert(productLocalEntity)
}
