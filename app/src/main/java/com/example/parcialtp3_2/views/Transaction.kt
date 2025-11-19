package com.example.parcialtp3_2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.BalanceCard
import com.example.parcialtp3_2.components.IncomeExpenseRow
import com.example.parcialtp3_2.components.TransactionRow
import androidx.compose.ui.draw.clip
import com.example.parcialtp3_2.infraestructure.RetrofitClient
import kotlinx.coroutines.launch

data class TxItem(
    val id: Int,
    val title: String,
    val date: String,
    val subtitle: String,
    val amount: String,
    val iconRes: Int
)

@Composable
fun TransactionScreenContent(modifier: Modifier, navController: NavController) {

    val sample = remember {
        listOf(
            TxItem(1, "Salary", "18:27 - April 30", "Monthly", "$4,000.00", R.drawable.money),
            TxItem(2, "Groceries", "17:00 - April 24", "Pantry", "-$100.00", R.drawable.shopping),
            TxItem(3, "Rent", "8:30 - April 15", "Rent", "-$674.40", R.drawable.key),
            TxItem(4, "Transport", "7:30 - April 08", "Fuel", "-$4.13", R.drawable.transport),
            TxItem(5, "Food", "19:30 - March 31", "Dinner", "-$70.40", R.drawable.fork_knife_white)
        )
    }

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
                        IconButton(onClick = { navController?.navigateUp() }) {
                            Icon(
                                painter = androidx.compose.ui.res.painterResource(id = R.drawable.flecha_back),
                                contentDescription = "back",
                                tint = Color.White
                            )
                        }

                        Spacer(modifier = Modifier.weight(1f))
                        Text(text = "Transaction", style = MaterialTheme.typography.headlineSmall, color = Color.Black)
                        Spacer(modifier = Modifier.weight(1f))

                        IconButton(onClick = {}) {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(CircleShape)
                                    .background(Color.White),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.bell),
                                    contentDescription = "bell",
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }


                    Spacer(modifier = Modifier.height(50.dp))

                    BalanceCard(totalBalance = "$7,783.00")

                    Spacer(modifier = Modifier.height(12.dp))

                    IncomeExpenseRow()
                }
            },
            content2 = {
                LaunchedEffect(key1 = Unit) {
                    val client = RetrofitClient()
                    val res = client.getTransaction()
                }

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
                            Text(text = "April", style = MaterialTheme.typography.titleMedium, fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold)
                            Spacer(modifier = Modifier.height(8.dp))

                            LazyColumn(
                                modifier = Modifier.fillMaxWidth(),
                                contentPadding = PaddingValues(vertical = 4.dp),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                items(sample) { tx ->
                                    TransactionRow(tx)

                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(1.dp)
                                            .background(Color(0xFFDAEFE6))
                                    )
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}