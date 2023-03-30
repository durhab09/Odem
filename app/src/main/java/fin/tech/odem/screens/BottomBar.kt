package fin.tech.odem.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import fin.tech.odem.R
import fin.tech.odem.screens.destinations.HomeViewDestination
import fin.tech.odem.screens.destinations.PaymentsViewDestination
import fin.tech.odem.screens.destinations.WalletViewDestination
@Destination
@Composable
fun BottomBar(/*navigator: DestinationsNavigator*/) {
    var isHomeSelected by remember { mutableStateOf(false) }
    var isWalletSelected by remember { mutableStateOf(false) }
    var isPaymentSelected by remember { mutableStateOf(false) }
    Box(modifier = Modifier.size(width = 380.dp, height = 100.dp)){
        Column {
            Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = {/*TODO*/},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF536DFE))) {
                    Text(text = "Request", fontSize = 16.sp,
                        modifier = Modifier.size(width = 64.dp, height = 18.dp),
                        textAlign = TextAlign.Center)
                }
                Button(onClick = {/*TODO*/},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF536DFE))) {
                    Text(text = "Send", fontSize = 16.sp,
                        modifier = Modifier.size(width = 64.dp, height = 18.dp),
                        textAlign = TextAlign.Center)
                }
            }
            Spacer(modifier = Modifier.padding(vertical = 2.dp))
            BottomAppBar(
                containerColor = Color.Transparent ,
                content = {
                    Column {
                        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
                            IconButton(onClick = {
                                isHomeSelected = !isHomeSelected
                                isPaymentSelected = false
                                isWalletSelected = false
                                //navigator.navigate(direction = HomeViewDestination)
                            }) {
                                if(isHomeSelected){
                                    Image(painter = painterResource(id = R.drawable.homeselected), contentDescription = "home")
                                }else{
                                    Image(painter = painterResource(id = R.drawable.home), contentDescription = "home")
                                }
                            }
                            IconButton(onClick = {
                                isPaymentSelected = !isPaymentSelected
                                isHomeSelected = false
                                isWalletSelected = false
                                //navigator.navigate(direction = PaymentsViewDestination)
                            }) {
                                if(isPaymentSelected){
                                    Image(painter = painterResource(id = R.drawable.dollarselected), contentDescription = "home")
                                }else{
                                    Image(painter = painterResource(id = R.drawable.dollar), contentDescription = "home")
                                }
                            }
                            IconButton(onClick = {
                                isWalletSelected = !isWalletSelected
                                isPaymentSelected = false
                                isHomeSelected = false
                                //navigator.navigate(direction = WalletViewDestination)
                            }) {
                                if(isWalletSelected){
                                    Image(painter = painterResource(id = R.drawable.walletselected), contentDescription = "home")
                                }else{
                                    Image(painter = painterResource(id = R.drawable.wallet), contentDescription = "home")
                                }
                            }

                        }
                    }
                }
            )
        }
    }
}