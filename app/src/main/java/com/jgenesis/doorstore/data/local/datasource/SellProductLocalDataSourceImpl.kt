package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.dao.SellProductDao
import com.jgenesis.doorstore.data.local.entity.SellProductLocalEntity
import javax.inject.Inject

class SellProductLocalDataSourceImpl @Inject constructor(
    private val sellProductDao: SellProductDao
) : SellProductLocalDataSource {
    override suspend fun insertBuy(
        sellProductLocalEntity: SellProductLocalEntity
    ) = sellProductDao.insert(sellProductLocalEntity)
}
