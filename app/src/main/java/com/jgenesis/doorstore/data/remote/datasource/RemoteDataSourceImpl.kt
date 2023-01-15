package com.jgenesis.doorstore.data.remote.datasource

import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import com.jgenesis.doorstore.framework.network.Api
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val api: Api
) : RemoteDataSource {
    override suspend fun getProducts(): List<ProductRemoteEntity>? {
        return api.getProducts().body()
    }
}
