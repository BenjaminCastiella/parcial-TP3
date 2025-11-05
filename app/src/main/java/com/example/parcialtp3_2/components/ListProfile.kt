package com.example.parcialtp3_2.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import data.ItemsPerfil
import org.w3c.dom.Text


import androidx.compose.material3.Text
import androidx.compose.ui.draw.rotate


@Composable
fun ListProfile(item: ItemsPerfil,
                onItemClick: (ItemsPerfil) -> Unit) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .height(50.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            IconBox(iconBox = item.IconBoxes, icon = item.iconID)
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = item.title,
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                color = Color(0xFF093030)
            )
        }


        if (item.flecha) {
            Box(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .size(30.dp)
                    .rotate(-90f)
                    .padding(end = 6.dp)
            ) {
                IconBox(
                    iconBox = IconBoxes.FLECHA_BLANCA,
                    icon = R.drawable.flecha_abajo
                )
            }
        }
    }
}
