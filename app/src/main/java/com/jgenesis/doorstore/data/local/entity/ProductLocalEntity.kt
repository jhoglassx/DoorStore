package com.jgenesis.doorstore.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(
    tableName = "product"
)
data class ProductLocalEntity(

    @ColumnInfo(name = "id")
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "type")
    val type: String,

    @ColumnInfo(name = "value")
    val value: String,

    @ColumnInfo(name = "date_create")
    val dateCreate: String?,

    @ColumnInfo(name = "date_update")
    val dateUpdate: String?
)
