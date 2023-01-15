package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.dao.SellDao
import com.jgenesis.doorstore.data.local.entity.SellLocalEntity
import javax.inject.Inject

class SellLocalDataSourceImpl @Inject constructor(
    private val sellDao: SellDao
) : SellLocalDataSource {
    override suspend fun insertSell(
        sellLocalEntity: SellLocalEntity
    ) = sellDao.insert(sellLocalEntity)

    override suspend fun getSellAll() = sellDao.getAll()
}
