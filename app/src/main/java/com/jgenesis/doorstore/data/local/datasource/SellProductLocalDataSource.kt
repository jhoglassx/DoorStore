package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.entity.SellProductLocalEntity

interface SellProductLocalDataSource {
    suspend fun insertBuy(sellProductLocalEntity: SellProductLocalEntity)
}
