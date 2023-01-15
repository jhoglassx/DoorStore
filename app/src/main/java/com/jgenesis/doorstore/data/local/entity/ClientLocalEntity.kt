package com.jgenesis.doorstore.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class ClientLocalEntity(
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "address")
    val address: String,

    @ColumnInfo(name = "email")
    val email: String,

    @ColumnInfo(name = "phone")
    val phone: Int,

    @ColumnInfo(name = "date_create")
    val dateCreate: String,

    @ColumnInfo(name = "date_update")
    val dateUpdate: String
)
