package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.parcialtp3_2.ui.theme.poppinsFamily


@Composable
fun BalanceCard(
    modifier: Modifier = Modifier,
    totalBalance: String = "$7,783.00"
) {
    Card(
        modifier = modifier
            .width(vertical)
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFE6FFF4)),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Total Balance",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF003300)
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = totalBalance,
                style = MaterialTheme.typography.displayLarge.copy(
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF003300)
                )
            )
        }
    }
}