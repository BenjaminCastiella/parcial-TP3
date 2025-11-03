package com.example.parcialtp3_2.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import  androidx.compose.ui.Modifier
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.R

@Composable
fun LogIn(navController: NavController, modifier: Modifier){
    ViewBackground(
        true,
        0.70f,
        navController,
        content1 = {

        },
        content2 = {
            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                IconBox(
                    iconBox = IconBoxes.LIGHT_BLUE,
                    icon = R.drawable.person
                )
                IconBox(iconBox = IconBoxes.MID_BLUE_SMALL, icon = R.drawable.person)
                IconBox(iconBox = IconBoxes.GREEN, icon = R.drawable.person)

            }
        }
    )
}