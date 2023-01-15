package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.SellLocalEntity
import com.jgenesis.doorstore.data.remote.entity.SellRemoteEntity

object SellMapper {
    fun domainToLocal(
        sellRemoteEntity: SellRemoteEntity
    ) = SellLocalEntity(
        id = sellRemoteEntity.id,
        clientId = sellRemoteEntity.clientId,
        dateCreate = sellRemoteEntity.dateCreate,
        dateUpdate = sellRemoteEntity.dateUpdate
    )
}
