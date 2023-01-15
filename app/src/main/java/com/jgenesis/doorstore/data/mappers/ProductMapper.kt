package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity

object ProductMapper {
    fun domainToLocal(
        productRemoteEntity: ProductRemoteEntity
    ) = ProductLocalEntity(
        id = productRemoteEntity.id,
        name = productRemoteEntity.name,
        type = productRemoteEntity.type,
        value = productRemoteEntity.value.toString(),
        dateCreate = productRemoteEntity.dateCreate,
        dateUpdate = productRemoteEntity.dateUpdate
    )
}
