package com.jgenesis.doorstore.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class SellCrossRef(
    @Embedded val sell: SellLocalEntity,

    @Relation(
        parentColumn = "client_id",
        entityColumn = "id",
        entity = ClientLocalEntity::class
    )
    val client: ClientLocalEntity,

    @Relation(
        parentColumn = "id",
        entityColumn = "sell_id",
        entity = SellProductLocalEntity::class
    )
    val products: List<ProductCrossRef>
)
