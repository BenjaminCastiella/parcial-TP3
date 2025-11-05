package com.example.parcialtp3_2.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import data.ItemSecurity
import data.ItemsPerfil
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes

@Composable
fun MostrarSecurity(item: ItemSecurity,
                onItemClick: (ItemSecurity) -> Unit) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            .padding(horizontal = 6.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(16.dp))


        Text(
            text = item.title,
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 13.sp,
            color = Color(0xFF093030),
            modifier = Modifier.weight(1f)
        )


        Box(
            modifier = Modifier
                .size(30.dp)
                .rotate(-90f)
                .align(Alignment.CenterVertically)
                .padding(end = 8.dp)
        ) {
            IconBox(
                iconBox = IconBoxes.FLECHA_BLANCA,
                icon = R.drawable.flecha_abajo
            )
        }
    }}