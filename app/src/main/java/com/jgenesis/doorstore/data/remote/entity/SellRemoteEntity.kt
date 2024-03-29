package com.jgenesis.doorstore.data.remote.entity

import com.google.gson.annotations.SerializedName

data class SellRemoteEntity(
    val id: Int,
    val products: List<SellProductRemoteEntity>,
    @SerializedName("client_id")
    val clientId: Int,
    @SerializedName("date_create")
    val dateCreate: String,
    @SerializedName("date_update")
    val dateUpdate: String
)
