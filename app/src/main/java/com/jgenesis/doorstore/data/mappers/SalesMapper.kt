package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.SellCrossRef
import com.jgenesis.doorstore.domain.entity.SalesDomainEntity

object SalesMapper {

    fun localToDomain(
        sellCrossRef: List<SellCrossRef>
    ) = sellCrossRef.map {
        localToDomain(it)
    }

    private fun localToDomain(
        sellCrossRef: SellCrossRef
    ) = SalesDomainEntity(
        sellId = sellCrossRef.sell.id,
        client = ClientMapper.localToDomain(sellCrossRef.client),
        products = SellProductMapper.localToDomain(sellCrossRef.products)
    )
}
