package com.example.parcial_tp3_gro_8.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun ViewBackground(
    hasNav: Boolean,
    whiteSpaceHeight: Float,
    content1: @Composable BoxScope.() -> Unit,
    content2: @Composable BoxScope.() -> Unit
){
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
    }
}