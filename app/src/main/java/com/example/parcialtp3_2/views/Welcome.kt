package com.example.parcialtp3_2.views

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.ViewsRoutes
import com.example.parcialtp3_2.components.confirmationButton

@Composable
fun Welcome(navController: NavController, modifier: Modifier){
    val pagerState = rememberPagerState(pageCount = { 2 })

    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { pageIndex ->
        when (pageIndex) {
            0 -> PageOne()
            1 -> PageTwo(navController)
        }
    }
}

@Composable
fun PageOne() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00D09E)),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally)
        {
            Icon(
                painter = painterResource(id = R.drawable.logo),
                tint = Color(0xFF0E3E3E),
                contentDescription = "FinWise"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "FinWise",
                fontSize = 52.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF)
            )
        }
    }
}

@Composable
fun PageTwo(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 40.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.logo),
                tint = Color(0xFF00D09E),
                contentDescription = "FinWise"
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "FinWise",
                fontSize = 36.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                fontWeight = FontWeight.Black,
                color = Color(0xFF00D09E)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod.",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                color = Color(0xFF4B4544)
            )

            Spacer(modifier = Modifier.height(48.dp))

            confirmationButton(modifier = Modifier,
                initText = stringResource(R.string.log_in_button),
                buttonColor = Color(0xFF00D09E),
                esCreate = false,
                onClick = {
                    navController.navigate(ViewsRoutes.SIGN_UP.getRoute())
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            confirmationButton(
                modifier = Modifier,
                initText = stringResource(R.string.sign_up_button),
                buttonColor = Color(0xFFDFF7E2),

                esCreate = true,
                onClick = {

                    navController.navigate(ViewsRoutes.CREATE_ACCOUNT.getRoute())
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Forgot Password?",
                fontSize = 14.sp,
                color = Color(0xFF093030),
                fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                modifier = Modifier.padding(top = 8.dp).clickable{
                    navController.navigate(ViewsRoutes.FORGOT_PSWD.getRoute())
                }

            )
        }
    }
}