package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.BuyLocalEntity
import com.jgenesis.doorstore.data.remote.entity.BuyRemoteEntity

object BuyMapper {
    fun domainToLocal(
        buyRemoteEntity: BuyRemoteEntity
    ) = BuyLocalEntity(
        id = buyRemoteEntity.id,
        productId = buyRemoteEntity.productId,
        value = buyRemoteEntity.value.toString(),
        dateCreate = buyRemoteEntity.dateCreate,
        dateUpdate = buyRemoteEntity.dateUpdate
    )
}
