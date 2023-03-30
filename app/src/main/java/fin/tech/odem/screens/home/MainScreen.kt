package fin.tech.odem.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import fin.tech.odem.screens.BottomBar

@Destination
@Composable
fun MainScreen(navigator: DestinationsNavigator) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp, end = 16.dp, top = 8.dp)
        ) {
            //Part 1 : home screen view or when home button clicked
            HomeView()
            //PaymentsView()
            //WalletView()
            //SupportView()
        }

        //this part is always on screen
        BottomBar(navigator)
    }
}

/*fun HomeScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
    ){
        Column(verticalArrangement = Arrangement.SpaceEvenly){
            //Part 1 : home screen view or when home button clicked
            HomeView()
            //Part 2 : Payments view or when payments button clicked
            //Part 3 : Wallet view or when wallet button clicked
            //this part is always on screen
            BottomBar()
        }
    }
}*/