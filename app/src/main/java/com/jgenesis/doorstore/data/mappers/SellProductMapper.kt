package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.SellProductLocalEntity
import com.jgenesis.doorstore.data.remote.entity.SellProductRemoteEntity

object SellProductMapper {
    fun domainToLocal(
        sellProductRemoteEntity: SellProductRemoteEntity,
        sellId: Int
    ) = SellProductLocalEntity(
        id = sellProductRemoteEntity.id,
        sellId = sellId,
        productId = sellProductRemoteEntity.productId,
        quantity = sellProductRemoteEntity.quantity,
        value = sellProductRemoteEntity.value.toString(),
        dateCreate = sellProductRemoteEntity.dateCreate,
        dateUpdate = sellProductRemoteEntity.dateUpdate
    )
}
