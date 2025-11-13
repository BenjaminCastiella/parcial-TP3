package com.example.parcialtp3_2.components



import android.provider.Settings.System.getString
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
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import dagger.hilt.android.internal.Contexts.getApplication
import data.ItemsPerfil


@Composable
fun VistaPerfil (onNavigate: (String) -> Unit, int: Int) {
    val items = listOf(
        ItemsPerfil("Editar Perfil", R.drawable.profile, IconBoxes.LIGHT_BLUE, ViewsRoutes.EDIT_PROFILE.getRoute(),false),
        ItemsPerfil("Security",R.drawable.seguridad, IconBoxes.MID_BLUE, ViewsRoutes.SECURITY.getRoute(),false),
        ItemsPerfil("Settings",R.drawable.settings, IconBoxes.DARK_BLUE, ViewsRoutes.PROFILE.getRoute(),false),
        ItemsPerfil("Help",R.drawable.help, IconBoxes.LIGHT_BLUE, ViewsRoutes.PROFILE.getRoute(),false),
        ItemsPerfil("Logout",R.drawable.logout, IconBoxes.MID_BLUE, ViewsRoutes.PROFILE.getRoute(),false)
    )

    val itemsFinger = listOf(
        ItemsPerfil("John Fingerprint",R.drawable.huella,IconBoxes.LIGHT_BLUE,ViewsRoutes.JOHN_FINGER.getRoute(),true),
        ItemsPerfil("Add Fingerprint",R.drawable.mas,IconBoxes.DARK_BLUE,ViewsRoutes.ADD_FINGER.getRoute(),true)

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