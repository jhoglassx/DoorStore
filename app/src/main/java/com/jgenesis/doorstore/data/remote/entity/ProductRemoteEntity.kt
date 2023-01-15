package com.jgenesis.doorstore.data.remote.entity

import java.math.BigDecimal

data class ProductRemoteEntity(
    val id: Int,
    val name: String,
    val type: String,
    val value: BigDecimal,
    val date_create: String,
    val date_update: String
)
