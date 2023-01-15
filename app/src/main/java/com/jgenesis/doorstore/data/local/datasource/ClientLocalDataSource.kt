package com.jgenesis.doorstore.data.local.datasource

import com.jgenesis.doorstore.data.local.entity.ClientLocalEntity

interface ClientLocalDataSource {
    suspend fun insertClient(clientLocalEntity: ClientLocalEntity)
}
