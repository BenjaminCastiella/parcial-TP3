package com.example.parcialtp3_2.components.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.ui.theme.poppinsFamily




data class ExpenseData(
    val month: String,
    val icon: Int,
    val title: String,
    val description: String,
    val amount: String
)


@Composable
fun ExpenseGrid(
    navController: NavController,
    expenses: List<ExpenseData>,
    buttonText: String = "Add Expenses"
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {


        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            val grouped = expenses.groupBy { it.month }

            grouped.forEach { (month, monthExpenses) ->

                Text(
                    text = month,
                    fontFamily = poppinsFamily,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                monthExpenses.forEach { expense ->
                    Expense(
                        icon = expense.icon,
                        title = expense.title,
                        description = expense.description,
                        amount = expense.amount
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFF00D09E))
                .clickable { navController.navigate("addExpenses") },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = buttonText,
                color = Color.White,
                fontFamily = poppinsFamily,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,
                fontSize = 16.sp
            )
        }
    }
}