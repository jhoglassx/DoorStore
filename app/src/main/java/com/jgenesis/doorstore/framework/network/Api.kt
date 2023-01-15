package com.jgenesis.doorstore.framework.network

import com.jgenesis.doorstore.data.remote.entity.BuyRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ClientRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.SellRemoteEntity
import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("product")
    suspend fun getProducts(): Response<List<ProductRemoteEntity>>

    @GET("client")
    suspend fun getClients(): Response<List<ClientRemoteEntity>>

    @GET("sell")
    suspend fun getSells(): Response<List<SellRemoteEntity>>

    @GET("buy")
    suspend fun getBuys(): Response<List<BuyRemoteEntity>>
}
