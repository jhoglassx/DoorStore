package com.jgenesis.doorstore.framework.network

import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("product")
    suspend fun getProducts(): Response<List<ProductRemoteEntity>>
}
