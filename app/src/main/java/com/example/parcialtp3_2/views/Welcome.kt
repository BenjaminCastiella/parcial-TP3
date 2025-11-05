package com.example.parcialtp3_2.views

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.parcialtp3_2.components.ViewBackground
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Welcome(navController: NavController, modifier: Modifier){
    data class CarouselItem(
        val i: Int,
        @DrawableRes val img: Int,
        val msj: String
    )
/*
    HorizontalUncontainedCarousel (
        state = rememberCarouselState { carouselItems.count() },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 16.dp, bottom = 16.dp),
        itemWidth = 186.dp,
        itemSpacing = 8.dp,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) { i ->
        val item = carouselItems[i]
        Image(
            modifier = Modifier
                .height(205.dp)
                .maskClip(MaterialTheme.shapes.extraLarge),
            painter = painterResource(id = item.img),
            contentDescription = item.msj,
            contentScale = ContentScale.Crop
        )
    }

    ViewBackground(
        false,
        0.70f,
        navController,
        content1 = {
            Text(
                "Welcome to Expense Manager",
                textAlign = TextAlign.Center,
                modifier = modifier
                    .padding(top = 30.dp),
                lineHeight = 40.sp,
                color = Color(0xAA031314),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        },
        content2 = {






            Image(
                modifier = modifier
                    .align(alignment = Alignment.Center)
                    .width(250.dp),
                painter = painterResource(id = R.drawable.welcome_img1),
                contentDescription = "Bienvenido"
            )
        }
    )
    */
}