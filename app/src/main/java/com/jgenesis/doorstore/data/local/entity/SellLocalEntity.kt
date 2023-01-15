package com.jgenesis.doorstore.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "sell",
    foreignKeys = [
        ForeignKey(
            entity = ClientLocalEntity::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("client_id"),
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("id", "client_id")]
)
data class SellLocalEntity(

    @ColumnInfo(name = "id")
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "client_id")
    val clientId: Int,

    @ColumnInfo(name = "date_create")
    val dateCreate: String,

    @ColumnInfo(name = "date_update")
    val dateUpdate: String
)
