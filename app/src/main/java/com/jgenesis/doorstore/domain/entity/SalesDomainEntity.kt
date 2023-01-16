package com.jgenesis.doorstore.domain.entity

import java.math.BigDecimal

data class SalesDomainEntity(
    val sellId: Int,
    val client: ClientDomainEntity,
    val products: List<SellProductDomainEntity>,
    val total: BigDecimal = products.sumOf { it.total }
)
