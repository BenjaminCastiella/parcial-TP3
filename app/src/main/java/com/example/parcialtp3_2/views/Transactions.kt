package com.example.parcialtp3_2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.components.*
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.BalanceCard
import com.example.parcialtp3_2.components.IncomeExpenseRow
import com.example.parcialtp3_2.infraestructure.RetrofitClient

data class TxItem(
    val id: Int,
    val title: String,
    val date: String,
    val subtitle: String,
    val amount: String,
    val iconRes: Int
)

@Composable
fun Transactions(modifier: Modifier, navController: NavController) {
    var selectedIndex by remember { mutableStateOf<Int?>(null) }

    Box(modifier = modifier) {
        ViewBackground(
            hasNav = true,
            whiteSpaceHeight = 0.65f,
            navController = navController,
            content1 = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 14.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                painter = painterResource(id = R.drawable.flecha_back),
                                contentDescription = "back",
                                tint = Color.White
                            )
                        }
                        Spacer(Modifier.weight(1f))
                        Text(
                            text = "Transaction",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.Black
                        )
                        Spacer(Modifier.weight(1f))
                        IconButton(
                            modifier = Modifier.background(
                                color = Color.White,
                                shape = CircleShape
                            ),
                            onClick = {}
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.bell),
                                contentDescription = "Notifications",
                                tint = Color(0xFF000000)
                            )
                        }
                    }

                    Spacer(Modifier.height(20.dp))
                    BalanceCard(totalBalance = "$7,783.00")
                    Spacer(Modifier.height(5.dp))

                    IncomeExpenseRow(
                        selectedIndex = selectedIndex,
                        onSelectedChange = { selectedIndex = it }
                    )
                }
            },
            content2 = {
                LaunchedEffect(key1 = Unit) {
                    val client = RetrofitClient()
                    val res = client.getTransaction()

                    println(res)
                }

                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        item {
                            when (selectedIndex) {
                                null -> TransactionListAll()
                                0 -> IncomeList()
                                1 -> ExpenseList()
                            }
                        }
                    }
                }

            }
        )
    }
}