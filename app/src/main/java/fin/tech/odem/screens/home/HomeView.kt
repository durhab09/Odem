package fin.tech.odem.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import fin.tech.odem.R

@Destination
@Composable
@Preview
fun HomeView() {
    Column {
        Welcome()
        Spacer(modifier = Modifier.padding(vertical = 24.dp))
        Balance()
        Spacer(modifier = Modifier.padding(vertical = 24.dp))
        HomePaymentsView()
    }
}

@Composable
fun Welcome() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.person),
                contentDescription = "Person logo", modifier = Modifier.size(width = 40.dp, height = 40.dp))
            Column {
                Text(text = "Welcome Back", color = Color.White)
                Text(text = "Name Here", color = Color.White)
            }
            SettingsButton()
        }
    }
}

@Composable
fun SettingsButton() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterEnd)
        ){
            Row {
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.support), contentDescription ="settings" )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Image(painter = painterResource(id = R.drawable.settings), contentDescription ="settings" )
                }
            }
        }
    }
}

@Composable
fun Balance() {
    Box(modifier = Modifier
        .size(width = 380.dp, height = 120.dp)
        .background(Color(0xFF141414), RoundedCornerShape(16.dp))){
        Column(modifier = Modifier.padding(start = 8.dp, top = 12.dp, end = 8.dp)) {
            Text(text = "Your balance is", color = Color.White)
            Spacer(modifier = Modifier.padding(vertical = 18.dp))
            Row {
                Text(text = "12,345.6 DZD", color = Color.White, fontSize = 16.sp)
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End) {
                    Text(text = "**** **** 1234", color = Color.White)
                }
            }
        }
    }
}