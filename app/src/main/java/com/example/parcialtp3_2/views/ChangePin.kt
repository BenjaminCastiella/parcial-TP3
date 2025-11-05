package com.example.parcialtp3_2.views

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.code_behind.IconBoxes
import com.example.parcialtp3_2.components.IconBox
import com.example.parcialtp3_2.components.InputChange
import com.example.parcialtp3_2.components.InputEditProfile
import com.example.parcialtp3_2.components.ListProfile
import com.example.parcialtp3_2.components.SwitchEditProfile
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.ui.theme.poppinsFamily
import androidx.compose.material3.Button
import com.example.parcialtp3_2.components.BotonChange

@Composable
fun ChangePin(navController: NavController, modifier: Modifier){
    ViewBackground(
        true,
        0.85f,
        navController,
        content1 = {Box(
            modifier = Modifier
                .absoluteOffset(x = 325.dp, y = 61.dp)
                .clip(RoundedCornerShape(25.71.dp))
                .width(30.dp)
                .height(30.dp)


        ) {
            IconBox(iconBox = IconBoxes.LIGHT_GREEN, icon = R.drawable.vector)
        }
            Box(
                modifier = Modifier
                    .absoluteOffset(x = 25.dp, y = 61.dp)
                    .clip(RoundedCornerShape(25.71.dp))
                    .width(30.dp)
                    .height(30.dp)
            ) {
                IconBox(iconBox = IconBoxes.GREEN, icon = R.drawable.flecha_back)
            }

            Text(
                text = "Change Pin",
                fontFamily = poppinsFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = colorResource(R.color.Void),
                modifier = Modifier.absoluteOffset(x = 130.dp, y = 61.dp)


            )






        },
        content2 = @androidx.compose.runtime.Composable {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 80.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                InputChange(title="Current Pin")
                InputChange(title="New Pin")
                InputChange(title="Current Pin")

                Spacer(modifier = Modifier.height(20.dp))


                BotonChange (navController)
                    }

                Spacer(modifier = Modifier.height(13.dp))





}
)
}