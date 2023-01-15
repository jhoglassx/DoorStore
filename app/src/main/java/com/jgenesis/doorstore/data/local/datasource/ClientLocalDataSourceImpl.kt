package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.dao.ClientDao
import com.jgenesis.doorstore.data.local.entity.ClientLocalEntity
import javax.inject.Inject

class ClientLocalDataSourceImpl @Inject constructor(
    private val clientDao: ClientDao
) : ClientLocalDataSource {
    override suspend fun insertClient(
        clientLocalEntity: ClientLocalEntity
    ) = clientDao.insert(clientLocalEntity)
}
