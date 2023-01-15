package com.jgenesis.doorstore.data.repository

import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSource
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dataSource: RemoteDataSource
) : Repository {
    override suspend fun loadProduct(): List<ProductRemoteEntity>? {
        return dataSource.getProducts()
    }
}
