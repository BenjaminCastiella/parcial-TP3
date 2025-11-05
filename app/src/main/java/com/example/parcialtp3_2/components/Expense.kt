package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.parcialtp3_2.code_behind.IconBoxes
import java.time.LocalDateTime

@Composable
fun Expense(
    iconBox: IconBoxes,
    icon: Int,
    expenseTitle: String,
    date: String,
    hour: String,
    category: String,
    expense: Double,
    expenseColorIsBlue: Boolean
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        //modifier = Modifier.padding(top = 25.dp)
    ) {
        IconBox(iconBox = iconBox, icon = icon)

        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Text(expenseTitle)
            Text(
                "$hour - $date",
                color = Color(0xFF0068FF),
                fontWeight = FontWeight.Bold
            )
        }

        Box(
            modifier = Modifier
                .width(1.dp)
                .height(42.dp)
                .background(Color(0xFF00D09E))
        )

        Text(category)

        Box(
            modifier = Modifier
                .width(1.dp)
                .height(42.dp)
                .background(Color(0xFF00D09E))
        )

        Text("$expense", color = if(expenseColorIsBlue) Color(0xFF0068FF) else Color.Black)
    }
}
