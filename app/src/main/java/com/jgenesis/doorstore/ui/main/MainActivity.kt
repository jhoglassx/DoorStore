package com.jgenesis.doorstore.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.jgenesis.doorstore.domain.entity.SalesDomainEntity
import com.jgenesis.doorstore.domain.entity.SellProductDomainEntity
import com.jgenesis.doorstore.ui.theme.DoorStoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DoorStoreTheme {
                DefaultPreview(viewModel)
                viewModel.getSells()
            }
        }
        viewModel.load()
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview(sells: MainActivityViewModel) {
        DoorStoreTheme {
            val sales by viewModel.sellsProducts.collectAsState()
            val constraints = ConstraintSet {
                val content = createRefFor("content")
                val balance = createRefFor("balance")

                constrain(content) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(balance.top)
                    width = Dimension.matchParent
                    height = Dimension.fillToConstraints
                }

                constrain(balance) {
                    start.linkTo(parent.start)
                    top.linkTo(content.bottom)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.wrapContent
                }
            }
            ConstraintLayout(
                constraintSet = constraints,
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.background)
                        .layoutId("content")
                ) {
                    Column() {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            items(
                                items = sales
                            ) { sell ->
                                SellCard(sell)
                                Divider(
                                    modifier = Modifier
                                        .padding(horizontal = 8.dp, vertical = 4.dp)
                                        .height(4.dp),
                                    color = Color.LightGray
                                )
                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .background(color = Color.Yellow)
                        .layoutId("balance")
                        .padding(4.dp)
                ) {
                    Column() {
                        Text(text = sales.sumOf { it.total }.toString())
                    }
                }
            }
        }
    }

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
}
