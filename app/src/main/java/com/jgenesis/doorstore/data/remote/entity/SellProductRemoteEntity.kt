package com.jgenesis.doorstore.data.remote.entity

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class SellProductRemoteEntity(
    val id: Int,
    @SerializedName("product_id")
    val productId: Int,
    val quantity: Int,
    val value: BigDecimal,
    @SerializedName("date_create")
    val dateCreate: String,
    @SerializedName("date_update")
    val dateUpdate: String
)
