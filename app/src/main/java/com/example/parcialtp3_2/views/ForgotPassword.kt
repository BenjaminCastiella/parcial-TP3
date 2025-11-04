package com.example.parcialtp3_2.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.parcialtp3_2.R
import com.example.parcialtp3_2.components.ViewBackground
import com.example.parcialtp3_2.components.inputText

@Composable

fun ForgotPassword(navController: NavController, modifier: Modifier){
    ViewBackground(
        false,
        0.80f,
        null,
        content1 = {
            Column (
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    stringResource(R.string.forgot),
                    modifier = Modifier.padding(top = 100.dp),
                    fontFamily = FontFamily(Font(R.font.poppins_semi_bold)),
                    fontWeight = FontWeight(600),
                    fontSize = 30.sp
                )

            }
        },
        content2 = {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Top
            ) {
                Spacer(modifier = Modifier.height(17.dp))


                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 45.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            stringResource(R.string.reset),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontWeight = FontWeight(500),
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }

                }
            }
        }

)
}
