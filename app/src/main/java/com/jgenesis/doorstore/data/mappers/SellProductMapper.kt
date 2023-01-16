package com.jgenesis.doorstore.data.mappers

import com.jgenesis.doorstore.data.local.entity.ProductCrossRef
import com.jgenesis.doorstore.data.local.entity.SellProductLocalEntity
import com.jgenesis.doorstore.data.remote.entity.SellProductRemoteEntity
import com.jgenesis.doorstore.domain.entity.SellProductDomainEntity

object SellProductMapper {
    fun domainToLocal(
        sellProductRemoteEntity: SellProductRemoteEntity,
        sellId: Int
    ) = SellProductLocalEntity(
        id = sellProductRemoteEntity.id,
        sellId = sellId,
        productId = sellProductRemoteEntity.productId,
        quantity = sellProductRemoteEntity.quantity,
        value = sellProductRemoteEntity.value.toString(),
        dateCreate = sellProductRemoteEntity.dateCreate,
        dateUpdate = sellProductRemoteEntity.dateUpdate
    )

    fun localToDomain(
        productCrossRef: List<ProductCrossRef>
    ) = productCrossRef.map {
        localToDomain(it)
    }

    private fun localToDomain(
        productCrossRef: ProductCrossRef
    ) = SellProductDomainEntity(
        id = productCrossRef.sellProduct.id,
        product = ProductMapper.localToDomain(productCrossRef.product) ,
        quantity = productCrossRef.sellProduct.quantity,
        value = productCrossRef.sellProduct.value.toBigDecimal()
    )
}
