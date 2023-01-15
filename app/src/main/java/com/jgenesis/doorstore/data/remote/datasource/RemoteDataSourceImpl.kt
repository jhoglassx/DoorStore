package com.jgenesis.doorstore.data.remote.datasource

import com.jgenesis.doorstore.data.remote.entity.BuyRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ClientRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.SellRemoteEntity
import com.jgenesis.doorstore.framework.network.Api
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val api: Api
) : RemoteDataSource {
    override suspend fun getProducts(): List<ProductRemoteEntity>? {
        return api.getProducts().body()
    }

    override suspend fun getClients(): List<ClientRemoteEntity>? {
        return api.getClients().body()
    }

    override suspend fun getBuys(): List<BuyRemoteEntity>? {
        return api.getBuys().body()
    }

    override suspend fun getSells(): List<SellRemoteEntity>? {
        return api.getSells().body()
    }
}
