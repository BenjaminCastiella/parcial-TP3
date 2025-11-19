package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import com.example.parcialtp3_2.R

@Composable
fun IncomeExpenseRow(
    selectedIndex: Int?,                          // null = All, 0 = Income, 1 = Expense
    onSelectedChange: (Int?) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        IncomeExpenseCard(
            title = "Income",
            amount = "$4,120.00",
            iconRes = R.drawable.income_icon,
            isSelected = selectedIndex == 0,
            onClick = { onSelectedChange(if (selectedIndex == 0) null else 0) },
            modifier = Modifier.weight(1f)
        )
        IncomeExpenseCard(
            title = "Expense",
            amount = "$1,187.40",
            iconRes = R.drawable.expense_icon,
            isSelected = selectedIndex == 1,
            onClick = { onSelectedChange(if (selectedIndex == 1) null else 1) },
            modifier = Modifier.weight(1f)
        )
    }
}