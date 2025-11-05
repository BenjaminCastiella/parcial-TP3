package com.example.parcialtp3_2.components

            import androidx.compose.foundation.Image
            import androidx.compose.foundation.background
            import androidx.compose.foundation.layout.*
            import androidx.compose.foundation.shape.CircleShape
            import androidx.compose.foundation.shape.RoundedCornerShape
            import androidx.compose.material3.Text
            import androidx.compose.material3.MaterialTheme
            import androidx.compose.runtime.Composable
            import androidx.compose.ui.Alignment
            import androidx.compose.ui.Modifier
            import androidx.compose.ui.draw.clip
            import androidx.compose.ui.graphics.Color
            import androidx.compose.ui.res.painterResource
            import androidx.compose.ui.unit.dp
            import com.example.parcialtp3_2.views.TxItem


            @Composable
            fun TransactionRow(tx: TxItem) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(57.dp)
                            .clip(RoundedCornerShape(29.dp))
                            .background(Color(0xFFCCEFFE)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = tx.iconRes),
                            contentDescription = tx.title,
                            modifier = Modifier.size(34.5.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(text = tx.title, style = MaterialTheme.typography.titleMedium)
                        Text(text = "${tx.subtitle} • ${tx.date}", style = MaterialTheme.typography.bodyMedium, color = Color(0xFF3A6C66))
                    }

                    Text(text = tx.amount, style = MaterialTheme.typography.titleMedium)
                }
            }