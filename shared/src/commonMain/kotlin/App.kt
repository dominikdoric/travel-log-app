import alphaServer.server.TravelLogServerImpl
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import data.remote.RemoteDataSourceImpl
import data.repository.BlogRepositoryImpl
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import domain.repository.BlogsRepository
import domain.useCases.GetBlogsUseCase
import presentation.screens.homeScreen.HomeScreen
import presentation.screens.homeScreen.HomeScreenViewModel
import presentation.voyager.HomeScreen

@Composable
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Navigator(HomeScreen)
        }
    }
}
