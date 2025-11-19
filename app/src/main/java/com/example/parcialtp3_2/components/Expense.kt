package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.ui.theme.poppinsFamily


@Composable
fun Expense(
    modifier: Modifier,
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
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        //modifier = Modifier.padding(top = 25.dp)
    ) {
        IconBox(iconBox = iconBox, icon = icon)

        Column(
            modifier = Modifier
                .weight(2f),
            horizontalAlignment = Alignment.Start
        ) {
            Text(expenseTitle,
                fontWeight = FontWeight.SemiBold,
                fontFamily = poppinsFamily,
                fontSize = 12.sp
            )
            Text(
                "$hour - $date",
                color = Color(0xFF0068FF),
                maxLines = 1,
                softWrap = false,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                fontFamily = poppinsFamily,
            )
        }

        Box(
            modifier = Modifier
                .width(1.dp)
                .height(42.dp)
                .background(Color(0xFF00D09E))
        )

        Text(
            category,
            modifier = Modifier.weight(1f),
            fontSize = 12.sp,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center
        )

        Box(
            modifier = Modifier
                .width(1.dp)
                .height(42.dp)
                .background(Color(0xFF00D09E))
        )

        Text("$$expense",
            modifier = Modifier.weight(1f),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            fontFamily = poppinsFamily,
            color = if(expenseColorIsBlue) Color(0xFF0068FF) else Color.Black)
    }
}
