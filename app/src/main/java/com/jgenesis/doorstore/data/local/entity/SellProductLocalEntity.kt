package com.jgenesis.doorstore.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "sell_product",
    foreignKeys = [
        ForeignKey(
            entity = SellLocalEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("sell_id"),
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = ProductLocalEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("product_id"),
            onDelete = ForeignKey.NO_ACTION
        )
    ],
    indices = [Index("product_id", "sell_id")]
)
data class SellProductLocalEntity(

    @ColumnInfo(name = "id")
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "sell_id")
    val sellId: Int,

    @ColumnInfo(name = "product_id")
    val productId: Int,

    @ColumnInfo(name = "quantity")
    val quantity: Int,

    @ColumnInfo(name = "value")
    val value: String,

    @ColumnInfo(name = "date_create")
    val dateCreate: String?,

    @ColumnInfo(name = "date_update")
    val dateUpdate: String?
)
