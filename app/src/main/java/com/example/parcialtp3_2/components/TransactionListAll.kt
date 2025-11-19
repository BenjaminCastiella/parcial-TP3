package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes

@Composable
fun TransactionListAll(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF2FFF7))
        ) {
            Column(modifier = Modifier.padding(16.dp)) {


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "April",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(color = Color(0xFF00D09E)),
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.calendar),
                            contentDescription = "calendario",
                            tint = Color.Black,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                Column(
                    verticalArrangement = Arrangement.spacedBy(25.dp),
                    modifier = Modifier.padding(top = 15.dp)
                ) {
                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                        icon = R.drawable.money,
                        expenseTitle = "Salary",
                        date = "April 30",
                        hour = "18:27",
                        category = "Monthly",
                        expense = 4000.00,
                        expenseColorIsBlue = false
                    )
                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                        icon = R.drawable.groceries,
                        expenseTitle = "Salary",
                        date = "April 24",
                        hour = "17:00",
                        category = "Pantry",
                        expense = -100.00,
                        expenseColorIsBlue = true
                    )
                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.DARK_BLUE_SMALL,
                        icon = R.drawable.key,
                        expenseTitle = "Rent",
                        date = "April 15",
                        hour = "8:30",
                        category = "Rent",
                        expense = -674.40,
                        expenseColorIsBlue = true
                    )
                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                        icon = R.drawable.transport,
                        expenseTitle = "Transport",
                        date = "April 08",
                        hour = "7:30",
                        category = "Fuel",
                        expense = -4.13,
                        expenseColorIsBlue = true
                    )

                    Text(text = "March", style = MaterialTheme.typography.titleMedium, fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold)

                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                        icon = R.drawable.fork_knife_white,
                        expenseTitle = "Food",
                        date = "March 31",
                        hour = "19:30",
                        category = "Dinner",
                        expense = -70.40,
                        expenseColorIsBlue = true
                    )

                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                        icon = R.drawable.fork_knife_white,
                        expenseTitle = "Food",
                        date = "March 31",
                        hour = "19:30",
                        category = "Dinner",
                        expense = -70.40,
                        expenseColorIsBlue = true
                    )

                    Expense(
                        modifier = Modifier,
                        iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                        icon = R.drawable.fork_knife_white,
                        expenseTitle = "Food",
                        date = "March 31",
                        hour = "19:30",
                        category = "Dinner",
                        expense = -70.40,
                        expenseColorIsBlue = true
                    )



                }
            }
        }
    }
}