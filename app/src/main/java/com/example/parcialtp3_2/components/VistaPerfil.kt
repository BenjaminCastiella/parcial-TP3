package com.example.parcialtp3_2.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import data.ItemsPerfil


@Composable
fun VistaPerfil (onNavigate: (String) -> Unit) {
    val items = listOf(
        ItemsPerfil("Edit Profile", R.drawable.profile, IconBoxes.LIGHT_BLUE, "editProfile"),
        ItemsPerfil("Security",R.drawable.seguridad, IconBoxes.MID_BLUE, "security"),
        ItemsPerfil("Settings",R.drawable.settings, IconBoxes.DARK_BLUE, "settings"),
        ItemsPerfil("Help",R.drawable.help, IconBoxes.LIGHT_BLUE, "profile"),
        ItemsPerfil("Logout",R.drawable.logout, IconBoxes.MID_BLUE, "profile")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        items(items) { item ->
            ListProfile(item) { clickedItem ->
                onNavigate(clickedItem.destination) }
        } }
}