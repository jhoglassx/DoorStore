package com.jgenesis.doorstore.data.remote.entity

import java.math.BigDecimal

data class BuyRemoteEntity(
    val id: Int,
    val productId: Int,
    val value: BigDecimal,
    val dateCreate: String,
    val dateUpdate: String
)
