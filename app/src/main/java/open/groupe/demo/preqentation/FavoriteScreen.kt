package open.groupe.demo.preqentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import open.groupe.demo.navigation.Screens

@Composable
fun FavoriteScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Text(text = "Favorite")
        Button(onClick = { navController.navigate(Screens.HomeScreenRoute.route) }) {
            Text(text = "Home")
        }
        Button(onClick = { navController.navigate(Screens.ProfileScreenRoute.route) }) {
            Text(text = "Profile")
        }
    }
}