package com.example.parcialtp3_2.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.categories.AppHeader
import com.example.parcialtp3_2.components.categories.CategoriesGrid
import com.example.parcialtp3_2.components.categories.ExpenseData
import com.example.parcialtp3_2.components.categories.ExpenseGrid
import com.example.parcialtp3_2.components.categories.Section


@Composable
fun Category(navController: NavController, modifier: Modifier, category: Int) {

    // Lista de gastos
    val expensesList: List<ExpenseData> = when(category) {
        R.string.food_c -> listOf(
            ExpenseData("April", R.drawable.food_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.food_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.food_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.food_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.food_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        R.string.transport_c -> listOf(
            ExpenseData("March", R.drawable.transport_c, "Fuel", "18:27 - March 30", "- 3,53"),
            ExpenseData("March", R.drawable.transport_c, "Car Parts", "15:00 - March 30", "- $26,75"),
            ExpenseData("February", R.drawable.transport_c, "New Tires", "12:47 - March 10", "- $373,99"),
            ExpenseData("February", R.drawable.transport_c, "Car Wash", "09:30 - February 09", "- $9,74"),
            ExpenseData("February", R.drawable.transport_c, "Public Transport", "07:50 - February 01", "- $1,24")
        )
        R.string.medicine_c -> listOf(
            ExpenseData("April", R.drawable.medicine_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.medicine_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.medicine_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.medicine_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.medicine_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        R.string.groceries_c -> listOf(
            ExpenseData("April", R.drawable.groceries_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.groceries_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.groceries_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.groceries_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.groceries_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        R.string.rent_c -> listOf(
            ExpenseData("April", R.drawable.rent_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.rent_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.rent_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.rent_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.rent_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        R.string.gift_c -> listOf(
            ExpenseData("April", R.drawable.gift_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.gift_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.gift_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.gift_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.gift_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        R.string.saving_c -> listOf(
            ExpenseData("April", R.drawable.saving_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.saving_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.saving_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.saving_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.saving_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        R.string.entertainment_c -> listOf(
            ExpenseData("April", R.drawable.entertainment_c, "Dinner", "18:27 - April 30", "- $26,00"),
            ExpenseData("April", R.drawable.entertainment_c, "Delivery Pizza", "15:00 - April 24", "- $18,35"),
            ExpenseData("April", R.drawable.entertainment_c, "Lunch", "12:30 - April 15", "- $15,40"),
            ExpenseData("April", R.drawable.entertainment_c, "Brunch", "09:30 - April 08", "- $12,13"),
            ExpenseData("March", R.drawable.entertainment_c, "Dinner", "20:50 - March 31", "- $27,20")
        )
        else -> emptyList()
    }

    ViewBackground(
        true,
        0.65f,
        navController,
        content1 = {
            AppHeader(navController = navController)
        },
        content2 = {
            ExpenseGrid(
                navController = navController,
                expenses = expensesList,
                buttonText = "Add Expenses"
            )
        }
    )
}