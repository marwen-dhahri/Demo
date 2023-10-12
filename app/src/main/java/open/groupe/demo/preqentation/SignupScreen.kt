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
fun SignupScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Text(text = "SignUp")
        Button(onClick = { navController.navigate(Screens.LoginScreenRoute.route) }) {
            Text(text = "Login")
        }
        Button(onClick = { navController.navigate(Screens.HomeScreenRoute.route) }) {
            Text(text = "Home")
        }
    }
}