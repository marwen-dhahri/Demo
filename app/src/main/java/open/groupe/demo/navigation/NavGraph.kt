package open.groupe.demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import open.groupe.demo.preqentation.HomeScreen
import open.groupe.demo.preqentation.LoginScreen
import open.groupe.demo.preqentation.ProfileScreen
import open.groupe.demo.preqentation.SignupScreen

@Composable
fun Nav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.route){
        authGraph(navController)
        appGraph(navController)
    }
}