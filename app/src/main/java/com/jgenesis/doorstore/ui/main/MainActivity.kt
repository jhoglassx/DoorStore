package com.jgenesis.doorstore.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.jgenesis.doorstore.ui.composable.SellCard
import com.jgenesis.doorstore.ui.composable.TotalBottomCard
import com.jgenesis.doorstore.ui.theme.DoorStoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DoorStoreTheme {
                DefaultPreview()
                viewModel.getSells()
            }
        }
        viewModel.load()
    }

    @Composable
    fun DefaultPreview() {
        DoorStoreTheme {
            val sales = viewModel.sellsProducts.collectAsState().value
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
                        .layoutId("content")
                ) {
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
                Box(
                    modifier = Modifier
                        .layoutId("balance")
                ) {
                    Column {
                        TotalBottomCard(sales.sumOf { it.total }.toString())
                    }
                }
            }
        }
    }
}
