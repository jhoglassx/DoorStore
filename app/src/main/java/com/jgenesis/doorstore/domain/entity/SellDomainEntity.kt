package com.jgenesis.doorstore.domain.entity

import java.math.BigDecimal

data class SellDomainEntity(
    val id: Int,
    val clientId: Int,
    val total: BigDecimal
)
