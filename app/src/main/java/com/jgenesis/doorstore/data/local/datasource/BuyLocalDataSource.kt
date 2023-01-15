package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.entity.BuyLocalEntity

interface BuyLocalDataSource {
    suspend fun insertBuy(buyLocalEntity: BuyLocalEntity)
}
