package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.ClientLocalEntity
import com.jgenesis.doorstore.data.remote.entity.ClientRemoteEntity

object ClientMapper {
    fun domainToLocal(
        clientRemoteEntity: ClientRemoteEntity
    ) = ClientLocalEntity(
        id = clientRemoteEntity.id,
        name = clientRemoteEntity.name,
        address = clientRemoteEntity.address,
        email = clientRemoteEntity.email,
        phone = clientRemoteEntity.phone,
        dateCreate = clientRemoteEntity.dateCreate,
        dateUpdate = clientRemoteEntity.dateUpdate
    )
}
