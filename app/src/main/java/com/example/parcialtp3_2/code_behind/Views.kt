package com.example.parcialtp3_2.code_behind

import com.example.parcialtp3_2.R

enum class Views (
    val route: String,
    val label: String,
    val icon: Int,
){
    MENU("home", "Menu", R.drawable.ic_home),
    ANALYSIS("home", "Menu", R.drawable.analysis),
    TRANSACTIONS("trans", "Menu", R.drawable.transactions),
    CATEGORY("category", "Menu", R.drawable.category),
    PROFILE("profile", "Menu", R.drawable.profile)
}