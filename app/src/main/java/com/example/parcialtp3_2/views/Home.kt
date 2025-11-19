package com.example.parcialtp3_2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.example.parcialtp3_2.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.Expense
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.categories.AppHeader

@Composable
fun Home(navController: NavController, modifier: Modifier){
    val periods = listOf<String>(
        stringResource(R.string.daily),
        stringResource(R.string.weekly),
        stringResource(R.string.monthly),
    )
    var selectedPeriod by remember { mutableIntStateOf(2) }
    val scrollState = rememberScrollState()

    ViewBackground(
        true,
        0.65f,
        navController,
        content1 = {
            Row(
                modifier = Modifier.padding(top = 50.dp, start = 20.dp, end = 20.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        stringResource(R.string.welcomeBack),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                    )
                    Text(
                        stringResource(R.string.goodMorning),
                        fontSize = 16.sp
                    )
                }

                IconButton(
                    modifier = Modifier
                        .background(
                            color = Color.White.copy(alpha = 1f),
                            shape = CircleShape
                        ),
                    onClick = { }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.bell),
                        contentDescription = "Notifications",
                        tint = Color(0xFF000000),
                        modifier = Modifier.size(30.dp)
                    )
                }
            }

            // SEGUNDO ROW (Total balance / expense)
            Column {
                Row(
                    modifier = Modifier
                        .padding(top = 140.dp, start = 40.dp, end = 40.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    // LEFT
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.income),
                                contentDescription = "Income",
                                tint = Color(0xFF000000),
                                modifier = Modifier.size(13.dp)
                            )
                            Text(
                                stringResource(R.string.balance),
                                fontSize = 15.sp
                            )
                        }
                        Text(
                            stringResource(R.string.totalBalance),
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF)
                        )
                    }

                    // DIVISOR
                    Box(
                        modifier = Modifier.padding(top = 10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .width(1.dp)
                                .height(42.dp)
                                .background(Color(0xFFFFFFFF))
                        )
                    }

                    // RIGHT
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.End
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.expense),
                                contentDescription = "Expense",
                                tint = Color(0xFF000000),
                                modifier = Modifier.size(13.dp)
                            )
                            Text(
                                stringResource(R.string.expense),
                                fontSize = 15.sp
                            )
                        }
                        Text(
                            stringResource(R.string.totalExpense),
                            fontSize = 27.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF0068FF)
                        )
                    }
                }
            }

            // BARRA DE PROGRESO
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 215.dp, start = 40.dp, end = 40.dp)
                    .height(27.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(25.dp)
                    )
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.3f)
                        .background(
                            color = Color(0xFF052224),
                            shape = RoundedCornerShape(
                                topStart = 25.dp,
                                bottomStart = 25.dp
                            )
                        )
                        .padding(horizontal = 23.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        stringResource(R.string.thirty),
                        color = Color.White,
                        fontSize = 14.sp,
                    )
                }

                Text(
                    stringResource(R.string.twentyThousand),
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(horizontal = 16.dp)
                )
            }

            // CHECK "looks good"
            Box(
                modifier = Modifier.padding(top = 255.dp, start = 60.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.check),
                        contentDescription = "Check",
                        tint = Color(0xFF000000),
                        modifier = Modifier.size(13.dp)
                    )
                    Text(
                        stringResource(R.string.thirtyOff),
                        fontSize = 17.sp
                    )
                }
            }
        },
        content2 = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth().fillMaxHeight().verticalScroll(scrollState)
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(35.dp))
                        .fillMaxWidth(0.90f)
                        .background(Color(0xFF00D09E)),
                ){
                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Column(
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Icon(
                                modifier = Modifier.size(100.dp),
                                painter = painterResource(id = R.drawable.car),
                                tint = null,
                                contentDescription = ""
                            )
                            Text(
                                stringResource(R.string.savings),
                                modifier = Modifier.width(80.dp),
                                textAlign = TextAlign.Center
                            )
                        }

                        Box(
                            modifier = Modifier
                                .width(3.dp)
                                .height(108.dp)
                                .background(Color(0xFFFFFFFF))
                        )

                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                modifier = Modifier.padding(20.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                            ) {
                                Icon(
                                    modifier = Modifier.size(40.dp),
                                    painter = painterResource(id = R.drawable.money),
                                    tint = Color(0xFF000000),
                                    contentDescription = "Revenue Last Week"
                                )
                                Column(
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.Start,
                                ) {
                                    Text(
                                        stringResource(R.string.revenueLastWeek),
                                        fontSize = 14.sp,
                                    )
                                    Text(
                                        stringResource(R.string.fourThousand),
                                        fontSize = 17.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            Box(
                                modifier = Modifier
                                    .width(161.dp)
                                    .height(3.dp)
                                    .background(Color(0xFFFFFFFF))
                            )

                            Row(
                                modifier = Modifier.padding(20.dp).width(200.dp),
                                horizontalArrangement = Arrangement.Start,
                            ) {
                                Icon(
                                    modifier = Modifier.size(40.dp),
                                    painter = painterResource(id = R.drawable.fork_knife),
                                    tint = Color(0xFF000000),
                                    contentDescription = "Expense"
                                )
                                Column(
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.Start,
                                ) {
                                    Text(
                                        stringResource(R.string.foodLastWeek),
                                        fontSize = 14.sp,
                                    )
                                    Text(
                                        stringResource(R.string.minusHundred),
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF0068FF)

                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .background(Color(0xFFDFF7E2))
                        .fillMaxWidth(.9f)
                        .padding(10.dp)
                ) {
                    periods.forEachIndexed { i, period ->
                        val isActive = selectedPeriod == i

                        Text(
                            period,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .clip(RoundedCornerShape(18.dp))
                                .width(100.dp)
                                .background(if(isActive) Color(0xFF00D09E) else Color(0x00000000))
                                .padding(15.dp)
                                .clickable{
                                    selectedPeriod = i

                                },
                        )
                    }
                }
                Spacer(modifier = Modifier.height(25.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.90f)
                            .clip(RoundedCornerShape(30.dp))
                            .padding(horizontal = 18.dp, vertical = 22.dp),
                        verticalArrangement = Arrangement.spacedBy(22.dp)
                    ) {
                        Expense(
                            modifier = Modifier.fillMaxWidth(),
                            iconBox = IconBoxes.LIGHT_BLUE_SMALL,
                            icon = R.drawable.money,
                            expenseTitle = stringResource(R.string.salaryExpense),
                            date = "April 30",
                            hour = "28:27",
                            category = stringResource(R.string.monthly),
                            expense = 4000.00,
                            expenseColorIsBlue = false
                        )
                        Expense(
                            modifier = Modifier.fillMaxWidth(),
                            iconBox = IconBoxes.MID_BLUE_SMALL,
                            icon = R.drawable.groceries,
                            expenseTitle = stringResource(R.string.groceries),
                            date = "April 24",
                            hour = "17:00",
                            category = "Pantry",
                            expense = -100.00,
                            expenseColorIsBlue = true
                        )
                        Expense(
                            modifier = Modifier.fillMaxWidth(),
                            iconBox = IconBoxes.DARK_BLUE_SMALL,
                            icon = R.drawable.key,
                            expenseTitle = stringResource(R.string.rent),
                            date = "April 15",
                            hour = "08:30",
                            category = "Rent",
                            expense = -674.40,
                            expenseColorIsBlue = true
                        )
                        Expense(
                            modifier = Modifier.fillMaxWidth(),
                            iconBox = IconBoxes.MID_BLUE_SMALL,
                            icon = R.drawable.bus,
                            expenseTitle = stringResource(R.string.transport),
                            date = "April 08",
                            hour = "09:30",
                            category = "Fuel",
                            expense = -4.13,
                            expenseColorIsBlue = true
                        )
                    }
                }
            }
        }
    )
}