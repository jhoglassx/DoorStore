package com.jgenesis.doorstore.data.remote.entity

import com.google.gson.annotations.SerializedName

data class ClientRemoteEntity(
    val id: Int,
    val name: String,
    val address: String,
    val email: String,
    val phone: Int,
    @SerializedName("date_create")
    val dateCreate: String,
    @SerializedName("date_update")
    val dateUpdate: String
)
