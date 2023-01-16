package com.jgenesis.doorstore.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class ProductCrossRef(
    @Embedded val sellProduct: SellProductLocalEntity,

    @Relation(
        parentColumn = "product_id",
        entityColumn = "id",
        entity = ProductLocalEntity::class
    )
    val product: ProductLocalEntity
)
