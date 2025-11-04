package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.ItemSecurity

@Composable
fun  SecurityItems(onNavigate: (String) -> Unit) {
    val items = listOf(
        ItemSecurity(title = "Change pin", destination = "changePin"),
        ItemSecurity(title = "Fingerprint", destination = "security"),
        ItemSecurity(title = "Terms and conditions", destination = "security")
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        items(items) { item ->
            MostrarSecurity(item) { clickedItem ->
                onNavigate(clickedItem.destination) }
        } }





}