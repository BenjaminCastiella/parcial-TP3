package com.example.parcialtp3_2.components.categories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.parcialtp3_2.components.categories.CategoryItem
import com.example.parcialtp3_2.R
@Composable
fun CategoriesGrid(navController: NavController) {

    Column(
        modifier = Modifier.padding(top = 40.dp)
    ) {

        val categories = listOf(
            Pair(R.drawable.food_c, R.string.food_c),
            Pair(R.drawable.transport_c, R.string.transport_c),
            Pair(R.drawable.medicine_c, R.string.medicine_c),
            Pair(R.drawable.groceries_c, R.string.groceries_c),
            Pair(R.drawable.rent_c, R.string.rent_c),
            Pair(R.drawable.gift_c, R.string.gift_c),
            Pair(R.drawable.saving_c, R.string.saving_c),
            Pair(R.drawable.entertainment_c, R.string.entertainment_c),
            Pair(R.drawable.more_c, R.string.more_c)
        )

        // Filas de 3 elementos
        for (rowIndex in categories.indices step 3) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (i in rowIndex until rowIndex + 3) {
                    if (i < categories.size) {
                        CategoryItem(
                            icon = categories[i].first,
                            title = categories[i].second
                        ){
                            //navController.navigate("category")
                            navController.navigate("category/${categories[i].second}")
                        }
                    }
                }
            }
        }
    }
}