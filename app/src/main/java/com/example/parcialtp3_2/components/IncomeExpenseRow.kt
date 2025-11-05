package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Implementación mínima para evitar errores de referencia. Puedes enriquecerla después.
@Composable
fun IncomeExpenseRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text("Income: $4,000.00")
        Spacer(modifier = Modifier.weight(1f))
        Text("Expense: -$1,187.40")
    }
}