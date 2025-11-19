package com.example.parcialtp3_2.code_behind

import com.example.parcialtp3_2.R

enum class Views (
    val route: String,
    val label: String,
    val icon: Int,
){
    MENU(ViewsRoutes.HOME.getRoute(), "Menu", R.drawable.ic_home),
    ANALYSIS(ViewsRoutes.HOME.getRoute(), "Analysis", R.drawable.analysis),
    TRANSACTIONS(ViewsRoutes.TRANSACTIONS.getRoute(), "Transactions", R.drawable.transactions),
    CATEGORY(ViewsRoutes.CATEGORIES.getRoute(), "Categories", R.drawable.category),
    PROFILE(ViewsRoutes.PROFILE.getRoute(), "Peofile", R.drawable.profile)
}