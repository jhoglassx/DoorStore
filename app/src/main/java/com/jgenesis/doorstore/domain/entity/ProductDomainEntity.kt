package com.jgenesis.doorstore.domain.entity

import java.math.BigDecimal

data class ProductDomainEntity(
    val id: Int,
    val name: String,
    val type: String,
    val value: BigDecimal
)
