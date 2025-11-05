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
fun VistaPerfil (onNavigate: (String) -> Unit, int: Int) {
    val items = listOf(
        ItemsPerfil("Edit Profile", R.drawable.profile, IconBoxes.LIGHT_BLUE, "editProfile",false),
        ItemsPerfil("Security",R.drawable.seguridad, IconBoxes.MID_BLUE, "security",false),
        ItemsPerfil("Settings",R.drawable.settings, IconBoxes.DARK_BLUE, "profile",false),
        ItemsPerfil("Help",R.drawable.help, IconBoxes.LIGHT_BLUE, "profile",false),
        ItemsPerfil("Logout",R.drawable.logout, IconBoxes.MID_BLUE, "profile",false)
    )

    val itemsFinger = listOf(
        ItemsPerfil("John Fingerprint",R.drawable.huella,IconBoxes.LIGHT_BLUE,"johnFinger",true),
        ItemsPerfil("Add Fingerprint",R.drawable.mas,IconBoxes.DARK_BLUE,"addFinger",true)

    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        if(int==0){
        items(items) { item ->
            ListProfile(item) { clickedItem ->
                onNavigate(clickedItem.destination)
            }
        }
        }else{
            items(itemsFinger) { item ->
                ListProfile(item) { clickedItem ->
                    onNavigate(clickedItem.destination)
                }
            }
        }
    }
}