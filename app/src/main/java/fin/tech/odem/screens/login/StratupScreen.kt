package fin.tech.odem.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fin.tech.odem.R

@Composable
fun Startup (navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Welcome to Odem \uD83D\uDC4B", color = Color.White)
        Spacer(modifier = Modifier.padding(vertical = 24.dp))
        Image(painter = painterResource(id = R.drawable.onlinepayment), contentDescription = "Payments logo",modifier = Modifier.size(256.dp))
        Spacer(modifier = Modifier.padding(vertical = 24.dp))
        Button(onClick = { navController.navigate("login") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF536DFE))) {

            Text(text = "Login", fontSize = 24.sp,
                modifier = Modifier.size(width = 128.dp, height = 36.dp),
                textAlign = TextAlign.Center)
        }
        Spacer(modifier = Modifier.padding(vertical = 24.dp))
        Button(onClick = { navController.navigate("register") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF536DFE))) {
            Text(text = "Register", fontSize = 24.sp,
                modifier = Modifier.size(width = 128.dp, height = 36.dp),
                textAlign = TextAlign.Center)
        }
    }
}