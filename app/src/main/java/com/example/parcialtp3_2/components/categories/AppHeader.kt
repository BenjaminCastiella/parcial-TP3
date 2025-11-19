package com.example.parcialtp3_2.components.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox


@Composable
fun AppHeader(navController: NavController) {

    Section(navController = navController)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 140.dp, start = 40.dp, end = 40.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            // LEFT BALANCE
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.income),
                        contentDescription = "Income",
                        tint = Color.Black,
                        modifier = Modifier.size(13.dp)
                    )
                    Text("Total balance", fontSize = 15.sp)
                }

                Text(
                    "$7,783.00",
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .width(1.dp)
                    .height(42.dp)
                    .background(Color.White)
            )

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.End
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.expense),
                        contentDescription = "Expense",
                        tint = Color.Black,
                        modifier = Modifier.size(13.dp)
                    )
                    Text("Total expense", fontSize = 15.sp)
                }

                Text(
                    "-$1.187.40",
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0068FF)
                )
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 215.dp, start = 40.dp, end = 40.dp)
            .height(27.dp)
            .background(Color.White, RoundedCornerShape(25.dp))
    ) {

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.3f)
                .background(
                    Color(0xFF052224),
                    RoundedCornerShape(topStart = 25.dp, bottomStart = 25.dp)
                )
                .padding(horizontal = 23.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text("30%", color = Color.White, fontSize = 14.sp)
        }

        Text(
            "$20,000.00",
            color = Color.Black,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 16.dp)
        )
    }

    Row(
        modifier = Modifier
            .padding(top = 255.dp, start = 60.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.check),
            contentDescription = "Check",
            tint = Color.Black,
            modifier = Modifier.size(13.dp)
        )
        Text("30% of your expenses, looks good.", fontSize = 17.sp)
    }
}