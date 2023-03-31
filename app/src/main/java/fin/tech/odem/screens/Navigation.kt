package fin.tech.odem.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fin.tech.odem.screens.login.LoginView
import fin.tech.odem.screens.login.PersonalInformationsView
import fin.tech.odem.screens.login.RegisterView
import fin.tech.odem.screens.login.Startup
/*
@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Startup"){
        composable(route="Startup"){
            Startup(navController)
        }

        composable(route="login"){
            LoginView(navController)
        }

        composable(route = "register"){
            RegisterView(navController)
        }

        composable(route = "PersonalInfos"){
            PersonalInformationsView(navController)
        }

        composable(route="HomeScreen"){
            MainScreen()
        }
    }
}*/

