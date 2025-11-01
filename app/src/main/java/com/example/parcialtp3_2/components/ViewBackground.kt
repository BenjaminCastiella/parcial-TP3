package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.parcialtp3_2.code_behind.Views

@Composable
fun ViewBackground(
    hasNav: Boolean,
    whiteSpaceHeight: Float,
    navController: NavController?,
    content1: @Composable BoxScope.() -> Unit,
    content2: @Composable BoxScope.() -> Unit
){
    var selectedView by rememberSaveable { mutableIntStateOf(0) }

    Box(modifier = Modifier.fillMaxSize()){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF00D09E))
        ) {
            content1()
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(whiteSpaceHeight)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp))
                .background(Color(0xFFF1FFF3))
                .zIndex(0f)
        ){
            content2()
        }

        if(hasNav){
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp))
                    .background(Color(0xFFDFF7E2))
                    .fillMaxWidth()
                    .fillMaxHeight(0.12f)
                    .align(Alignment.BottomCenter)
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(alignment = Alignment.Center)
                ) {
                    Views.entries.forEachIndexed { index, view ->
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .clip(CircleShape)
                                .background(
                                    if (selectedView == index) Color(0xFF5FD3A1)
                                    else Color.Transparent
                                )
                                .clickable {
                                    selectedView = index
                                    navController?.navigate(view.route) {
                                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                                        launchSingleTop = true
                                        restoreState = true
                                    }
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(id = view.icon),
                                contentDescription = view.label,
                                tint = Color(0xFF001B11), // negro suave
                                modifier = Modifier.size(26.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}