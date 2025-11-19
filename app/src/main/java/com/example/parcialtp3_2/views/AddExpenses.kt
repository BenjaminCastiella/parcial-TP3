package com.example.parcialtp3_2.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.categories.AppHeader
import com.example.parcialtp3_2.components.categories.CategoriesGrid
import com.example.parcialtp3_2.components.categories.Section


@Composable
fun AddExpenses (navController: NavController, modifier: Modifier) {
    ViewBackground(
        true,
        0.80f,
        navController,
        content1 = {
            AppHeader(navController = navController)
        },
        content2 = {
            //
        }
    )
}