package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.ClientLocalEntity
import com.jgenesis.doorstore.data.remote.entity.ClientRemoteEntity
import com.jgenesis.doorstore.domain.entity.ClientDomainEntity

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

    fun localToDomain(
        clientLocalEntity: ClientLocalEntity
    ) = ClientDomainEntity(
        id = clientLocalEntity.id,
        name = clientLocalEntity.name,
        address = clientLocalEntity.address,
        email = clientLocalEntity.email,
        phone = clientLocalEntity.phone,
    )
}
