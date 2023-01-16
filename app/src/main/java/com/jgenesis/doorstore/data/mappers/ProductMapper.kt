package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity
import com.jgenesis.doorstore.data.remote.entity.ProductRemoteEntity
import com.jgenesis.doorstore.domain.entity.ProductDomainEntity

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

    fun localToDomain(
        productLocalEntity: List<ProductLocalEntity>
    ) = productLocalEntity.map {
        localToDomain(it)
    }

    fun localToDomain(
        productLocalEntity: ProductLocalEntity
    ) = ProductDomainEntity(
        id = productLocalEntity.id,
        name = productLocalEntity.name,
        type = productLocalEntity.type,
        value = productLocalEntity.value.toBigDecimal()
    )
}
