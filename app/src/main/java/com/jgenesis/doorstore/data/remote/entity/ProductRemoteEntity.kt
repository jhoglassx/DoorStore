package com.jgenesis.doorstore.data.remote.entity

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class ProductRemoteEntity(
    val id: Int,
    val name: String,
    val type: String,
    val value: BigDecimal,
    @SerializedName("date_create")
    val dateCreate: String,
    @SerializedName("date_update")
    val dateUpdate: String
)
