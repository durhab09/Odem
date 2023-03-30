package fin.tech.odem.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import fin.tech.odem.R

@Destination
@Composable
@Preview
fun WalletView() {
    Box(modifier = Modifier.fillMaxWidth()){
        Column {
            Row {
                IconButton(onClick = { /*TODO*/ }) {
                    Image(modifier = Modifier.size(48.dp),painter = painterResource(id = R.drawable.back), contentDescription ="back")
                }
                Text(text = "Payments",
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Spacer(modifier = Modifier.padding(vertical = 18.dp))
            Balance()
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            WalletInformations()
        }
    }
}

@Composable
fun WalletInformations() {
    Box(modifier = Modifier
        .size(width = 380.dp, height = 220.dp)
        .background(Color(0xFF141414), RoundedCornerShape(16.dp))){
        Column(modifier = Modifier.padding(start = 8.dp, top = 12.dp, end = 8.dp)) {
            Text(text = "Account holder", color = Color.White)
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Text(text = "{Full name here}", color = Color.White)
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            Text(text = "Account number", color = Color.White)
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Text(text = "{Account number here}", color = Color.White)
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            Text(text = "Address", color = Color.White)
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Text(text = "{client address}", color = Color.White)
        }
    }
}