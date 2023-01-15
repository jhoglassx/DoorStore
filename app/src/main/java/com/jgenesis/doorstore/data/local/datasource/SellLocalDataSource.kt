package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.entity.SellCrossRef
import com.jgenesis.doorstore.data.local.entity.SellLocalEntity

interface SellLocalDataSource {
    suspend fun insertSell(sellLocalEntity: SellLocalEntity)
    suspend fun getSellAll(): List<SellCrossRef>
}
