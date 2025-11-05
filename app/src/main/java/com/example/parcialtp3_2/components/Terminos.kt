package com.example.parcialtp3_2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
import com.example.parcialtp3_2.ui.theme.LeagueFamily
import com.example.parcialtp3_2.ui.theme.poppinsFamily

@Composable
fun Terminos(navController: NavController) {
    val scrollState = rememberScrollState()

    Box(

    ) {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.Start
        ) {

            Text(
                text = "Est fugiat assumenda aut reprehenderit\n\n" +
                        "Lorem ipsum dolor sit amet. Et odio officia aut voluptate internos est omnis vitae ut architecto sunt non tenetur fuga ut provident vero. Quo aspernatur facere et consectetur ipsum et facere corrupti est asperiores facere. Est fugiat assumenda aut reprehenderit voluptatem sed.\n\n" +
                        "Ea voluptates omnis aut sequi sequi.\n" +
                        "Est dolore quae in aliquid ducimus et autem repellendus.\n" +
                        "Aut ipsum Quis qui porro quasi aut minus placeat!\n" +
                        "Sit consequatur neque ab vitae facere.\n\n" +
                        "Aut quidem accusantium nam alias autem eum officiis placeat et omnis autem id officiis perspiciatis qui corrupti officia eum aliquam provident. Eum voluptas error et optio dolorum cum molestiae nobis et odit molestiae quo magnam impedit sed fugiat nihil non nihil vitae.\n\n" +
                        "Aut fuga sequi eum voluptatibus provident.\n" +
                        "Eos consequuntur voluptas vel amet eaque aut dignissimos velit.\n\n" +
                        "Vel exercitationem quam vel eligendi rerum At harum obcaecati et nostrum beatae? Ea accusantium dolores qui rerum aliquam est perferendis mollitia et ipsum ipsa qui enim autem At corporis sunt. Aut odit quisquam est reprehenderit itaque aut accusantium dolor qui neque repellat.",
                fontFamily = LeagueFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = colorResource(R.color.Void),
                lineHeight = 15.sp
            )


        }
    }
}