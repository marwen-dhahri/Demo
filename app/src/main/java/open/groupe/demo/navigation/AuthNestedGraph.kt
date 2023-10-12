package open.groupe.demo.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import open.groupe.demo.preqentation.LoginScreen
import open.groupe.demo.preqentation.SignupScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation(startDestination = Screens.LoginScreenRoute.route, route = Screens.AuthRoute.route ){
        composable(route = Screens.LoginScreenRoute.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screens.SignupScreenRoute.route){
            SignupScreen(navController = navController)
        }
    }
}