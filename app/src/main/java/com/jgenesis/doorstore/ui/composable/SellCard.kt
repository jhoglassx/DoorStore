package com.jgenesis.doorstore.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jgenesis.doorstore.domain.entity.SalesDomainEntity

@Preview(showBackground = true)
@Composable
fun SellCard(sell: SalesDomainEntity) {
    Row(
        modifier = Modifier
            .padding(horizontal = 4.dp)
            .fillMaxSize(1f)
            .clip(RoundedCornerShape(5.dp))
    ) {
        Box(
            modifier = Modifier
                .background(Color.Gray)
                .fillMaxSize(1f)
        ) {
            Column() {
                Row(
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text(text = sell.client.name)
                    }
                    Column() {
                        Text(text = "R$ ${sell.total}")
                    }
                }
                Divider(modifier = Modifier.background(Color.Transparent).padding(1.dp))
                Row(
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth()
                ) {
                    Column() {
                        sell.products.forEach { product ->
                            ProductCard(product)
                        }
                    }
                }
            }
        }
    }
}