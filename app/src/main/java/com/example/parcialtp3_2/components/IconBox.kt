package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.parcialtp3_2.code_behind.IconBoxes

@Composable
fun IconBox(iconBox: IconBoxes, icon: Int){
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(iconBox.getBoxRoundVal().dp))
            .background(Color(iconBox.getColor()))
            .width(iconBox.getBoxWidth().dp)
            .height(iconBox.getBoxHeight().dp)
    ){
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = Color(iconBox.getIconColor()) ,
            modifier = Modifier.size(iconBox.getIconSize().dp).align(alignment = Alignment.Center)
        )
    }
}