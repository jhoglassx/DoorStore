package com.jgenesis.doorstore.domain.entity

import java.math.BigDecimal

data class SellProductDomainEntity(

    val id: Int,
    val product: ProductDomainEntity,
    val quantity: Int,
    val value: BigDecimal,
    val total: BigDecimal = quantity.toBigDecimal() * value
)
