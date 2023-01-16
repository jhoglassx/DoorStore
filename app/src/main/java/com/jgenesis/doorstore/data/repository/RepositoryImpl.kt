package com.jgenesis.doorstore.data.repository

import android.util.Log
import com.jgenesis.doorstore.data.local.datasource.*
import com.jgenesis.doorstore.data.local.entity.*
import com.jgenesis.doorstore.data.mappers.SalesMapper
import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val productLocalDataSource: ProductLocalDataSource,
    private val clientLocalDataSource: ClientLocalDataSource,
    private val sellLocalDataSource: SellLocalDataSource,
    private val buyLocalDataSource: BuyLocalDataSource,
    private val sellProductLocalDataSource: SellProductLocalDataSource
) : Repository {
    override suspend fun loadProduct() = remoteDataSource.getProducts()

    override suspend fun loadClient() = remoteDataSource.getClients()

    override suspend fun loadBuy() = remoteDataSource.getBuys()

    override suspend fun loadSell() = remoteDataSource.getSells()

    override suspend fun insertProduct(productLocalEntity: ProductLocalEntity): Boolean {
        return try {
            productLocalDataSource.insertProduct(productLocalEntity)
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun insertClient(clientLocalEntity: ClientLocalEntity): Boolean {
        return try {
            clientLocalDataSource.insertClient(clientLocalEntity)
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun insertSell(sellLocalEntity: SellLocalEntity): Boolean {
        return try {
            sellLocalDataSource.insertSell(sellLocalEntity)
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun getSellAll() = SalesMapper.localToDomain(sellLocalDataSource.getSellAll())

    override suspend fun insertBuy(buyLocalEntity: BuyLocalEntity): Boolean {
        return try {
            buyLocalDataSource.insertBuy(buyLocalEntity)
            true
        } catch (e: Exception) {
            Log.i("INSERT ERROR", "$e")
            false
        }
    }

    override suspend fun insertSellProduct(sellProductLocalEntity: SellProductLocalEntity): Boolean {
        return try {
            sellProductLocalDataSource.insertBuy(sellProductLocalEntity)
            true
        } catch (e: Exception) {
            false
        }
    }
}
