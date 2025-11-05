package com.example.parcialtp3_2.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import data.ItemsPerfil
@Composable



fun ItemsFinger(item: ItemsPerfil,
                onItemClick: (ItemsPerfil) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            .padding(horizontal = 6.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconBox(iconBox = item.IconBoxes, icon = item.iconID)
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = item.title,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 15.sp,
            color = Color(0xFF093030),
        )
    }
}