package com.jgenesis.doorstore.data.remote.entity

import java.math.BigDecimal

data class ProductRemoteEntity(
    val id: Int,
    val name: String,
    val type: String,
    val value: BigDecimal,
    val dateCreate: String,
    val dateUpdate: String
)
