package com.jgenesis.doorstore.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.math.BigDecimal

data class SellLocalEntity(
    @ColumnInfo(name = "name")
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "product_id")
    val productId: Int,

    @ColumnInfo(name = "client_id")
    val clientId: Int,

    @ColumnInfo(name = "value")
    val value: BigDecimal,

    @ColumnInfo(name = "date_create")
    val dateCreate: String,

    @ColumnInfo(name = "date_update")
    val dateUpdate: String
)
