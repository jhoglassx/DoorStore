package com.jgenesis.doorstore.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.math.BigDecimal
import java.text.DecimalFormat

@Preview(showBackground = true)
@Composable
fun TotalBottomCard(total: BigDecimal = 00.00.toBigDecimal()) {
    Box(
        modifier = Modifier
            .layoutId("box")
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp, 8.dp, 0.dp, 0.dp))
            .background(color = Color.DarkGray)
            .padding(8.dp),
        contentAlignment = Alignment.CenterEnd
    ) {
        Row(
            horizontalArrangement = Arrangement.End
        ) {
            Column(
                modifier = Modifier
                    .layoutId("text")
            ) {
                Text(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    text = "Total: "
                )
            }
            Column(
                modifier = Modifier
                    .layoutId("content")
            ) {
                Text(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    text = total.toString()
                )
            }
        }
    }
}
