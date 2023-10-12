package open.groupe.demo.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import open.groupe.demo.preqentation.FavoriteScreen
import open.groupe.demo.preqentation.HomeScreen
import open.groupe.demo.preqentation.ProfileScreen

fun NavGraphBuilder.appGraph(navController: NavController){
    navigation(startDestination = Screens.HomeScreenRoute.route, route = Screens.AppRoute.route ){
        composable(route = Screens.HomeScreenRoute.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screens.ProfileScreenRoute.route){
            ProfileScreen(navController = navController)
        }
        composable(route = Screens.FavoriteScreenRoute.route){
            FavoriteScreen(navController = navController)
        }
    }
}