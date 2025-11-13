package com.example.parcialtp3_2.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.VistaPerfil
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun FingerPoint(navController: NavController, modifier: Modifier){

    ViewBackground(
        true,
        0.85f,
        navController,
        content1 = {Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding( top = 61.dp,end = 25.dp)
                .clip(RoundedCornerShape(25.71.dp))
                .width(30.dp)
                .height(30.dp)


        ) {
            IconBox(iconBox = IconBoxes.LIGHT_GREEN, icon = R.drawable.vector)
        }
            Box(
                modifier = Modifier
                    .padding(start = 25.dp, top = 61.dp)
                    .clip(RoundedCornerShape(25.71.dp))
                    .width(30.dp)
                    .height(30.dp)
            ) {
                IconBox(iconBox = IconBoxes.GREEN, icon = R.drawable.flecha_back)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 61.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "FingerPrint",
                    fontFamily = poppinsFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = colorResource(R.color.Void),
                    modifier = Modifier

                )
            }






        },content2 = {
            Column(
                modifier = Modifier.fillMaxSize().padding(top = 20.dp)
            ) {
                Spacer(modifier = Modifier.height(17.dp))
                VistaPerfil({ route -> navController.navigate(route)},1)
            }





        }








    )

}