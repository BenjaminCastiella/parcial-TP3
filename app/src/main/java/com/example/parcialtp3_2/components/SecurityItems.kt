package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import data.ItemSecurity

@Composable
fun  SecurityItems(onNavigate: (String) -> Unit) {
    val items = listOf(
        ItemSecurity(title = stringResource(R.string.change_pin), destination = ViewsRoutes.CHANGE_PIN.getRoute()),
        ItemSecurity(title = stringResource(R.string.fingerprint), destination =ViewsRoutes.FINGER_POINT.getRoute() ),
        ItemSecurity(title = stringResource(R.string.terms_condition), destination = ViewsRoutes.TERMS_AND_CONDITIONS.getRoute())
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.spacedBy(50.dp)
    ) {
        items(items) { item ->
            MostrarSecurity(item) { clickedItem ->
                onNavigate(clickedItem.destination) }
        } }

}