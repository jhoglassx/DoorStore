package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.dao.BuyDao
import com.jgenesis.doorstore.data.local.entity.BuyLocalEntity
import javax.inject.Inject

class BuyLocalDataSourceImpl @Inject constructor(
    private val buyDao: BuyDao
) : BuyLocalDataSource {
    override suspend fun insertBuy(
        buyLocalEntity: BuyLocalEntity
    ) = buyDao.insert(buyLocalEntity)
}
