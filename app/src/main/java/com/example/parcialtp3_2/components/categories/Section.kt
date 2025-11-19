package com.example.parcialtp3_2.components.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox


@Composable
fun Section (navController: NavController) {

    Box(modifier = Modifier.fillMaxWidth()) {

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 61.dp, end = 25.dp)
                .clip(RoundedCornerShape(25.71.dp))
                .size(30.dp)
        ) {
            IconBox(iconBox = IconBoxes.LIGHT_GREEN, icon = R.drawable.vector)
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 25.dp, top = 61.dp)
                .clip(RoundedCornerShape(25.71.dp))
                .size(30.dp)
                .clickable {
                    navController.navigate("home")
                }
        ) {
            IconBox(iconBox = IconBoxes.GREEN, icon = R.drawable.flecha_back)
        }

        Text(
            text = "Categories",
            fontFamily = poppinsFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = colorResource(R.color.Void),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 61.dp)
        )
    }
}