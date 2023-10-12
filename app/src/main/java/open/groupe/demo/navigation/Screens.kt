package open.groupe.demo.navigation

sealed class Screens(val route :String) {
    object LoginScreenRoute : Screens(route = "Login")
    object SignupScreenRoute : Screens(route = "Signup")
    object HomeScreenRoute : Screens(route = "Home")
    object DetailScreenRoute : Screens(route = "Detail")
    object ProfileScreenRoute : Screens(route = "Profile")
    object AuthRoute : Screens(route = "Auth")
    object AppRoute : Screens(route = "App")
}