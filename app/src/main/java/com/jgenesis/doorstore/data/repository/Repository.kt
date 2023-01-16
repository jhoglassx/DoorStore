package com.jgenesis.doorstore.data.repository

import com.jgenesis.doorstore.data.local.entity.*
import com.jgenesis.doorstore.data.remote.entity.BuyRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ClientRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import com.jgenesis.doorstore.data.remote.entity.SellRemoteEntity
import com.jgenesis.doorstore.domain.entity.SalesDomainEntity

interface Repository {

    suspend fun loadProduct(): List<ProductRemoteEntity>?
    suspend fun loadClient(): List<ClientRemoteEntity>?
    suspend fun loadBuy(): List<BuyRemoteEntity>?
    suspend fun loadSell(): List<SellRemoteEntity>?

    suspend fun insertProduct(productLocalEntity: ProductLocalEntity): Boolean
    suspend fun insertClient(clientLocalEntity: ClientLocalEntity): Boolean
    suspend fun insertSell(sellLocalEntity: SellLocalEntity): Boolean
    suspend fun getSellAll(): List<SalesDomainEntity>
    suspend fun insertBuy(buyLocalEntity: BuyLocalEntity): Boolean
    suspend fun insertSellProduct(sellProductLocalEntity: SellProductLocalEntity): Boolean
}
