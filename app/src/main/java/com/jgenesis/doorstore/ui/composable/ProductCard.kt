package com.jgenesis.doorstore.ui.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jgenesis.doorstore.domain.entity.SellProductDomainEntity

@Preview(showBackground = true)
@Composable
fun ProductCard(product: SellProductDomainEntity) {
    Row() {
        Box() {
            Column() {
                Row() {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(1f),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(text = product.product.name)
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Quantity")
                        Text(text = product.quantity.toString())
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Valor")
                        Text(text = "R$ ${product.value}")
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Total")
                        Text(text = "R$ ${product.total}")
                    }
                }
            }
        }
    }
}