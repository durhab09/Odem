package fin.tech.odem.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun HomePaymentsView() {
    Box {
        LazyColumn{
            items(count = 5){
                i->
                run {
                    Row(
                        modifier = Modifier
                            .size(width = 380.dp, height = 40.dp)
                        .background(Color(0xFF303030), RoundedCornerShape(4.dp))
                        .padding(start = 8.dp, end = 8.dp)
                    ) {
                        Text(text = "From someone", color = Color.White)
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd){
                            Text(text = "value$", color = Color.White)
                        }
                    }
                    Spacer(modifier = Modifier.padding(vertical = 6.dp))
                }
            }
        }
    }
}