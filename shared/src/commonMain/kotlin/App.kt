import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import presentation.screens.homeScreen.HomeScreen
import presentation.screens.homeScreen.HomeScreenViewModel

@Composable
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            val homeScreenViewModel = getViewModel(Unit, viewModelFactory { HomeScreenViewModel() })
            HomeScreen(viewModel = homeScreenViewModel)
        }
    }
}
