package com.jgenesis.doorstore.data.repository

import com.jgenesis.doorstore.data.local.datasource.LocalDataSource
import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity
import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSource
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : Repository {
    override suspend fun loadProduct(): List<ProductRemoteEntity>? {
        return remoteDataSource.getProducts()
    }

    override suspend fun insertProduct(productLocalEntity: ProductLocalEntity): Boolean {
        return try {
            localDataSource.insertProduct(productLocalEntity)
            true
        } catch (e: Exception) {
            false
        }
    }
}
