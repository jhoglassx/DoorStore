package com.jgenesis.doorstore.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "buy",
    foreignKeys = [
        ForeignKey(
            entity = ProductLocalEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("product_id"),
            onDelete = ForeignKey.NO_ACTION
        )
    ],
    indices = [Index("id", "product_id")]
)
data class BuyLocalEntity(

    @ColumnInfo(name = "id")
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "product_id")
    val productId: Int,

    @ColumnInfo(name = "value")
    val value: String,

    @ColumnInfo(name = "date_create")
    val dateCreate: String,

    @ColumnInfo(name = "date_update")
    val dateUpdate: String
)
