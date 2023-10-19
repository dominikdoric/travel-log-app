package presentation.voyager

import alphaServer.server.TravelLogServerImpl
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import data.remote.RemoteDataSourceImpl
import data.repository.BlogRepositoryImpl
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import domain.useCases.GetBlogsUseCase
import presentation.screens.homeScreen.HomeScreen
import presentation.screens.homeScreen.HomeScreenViewModel

object HomeScreen : Screen {

    @Composable
    override fun Content() {
        val homeScreenViewModel = getViewModel(
            Unit,
            viewModelFactory {
                HomeScreenViewModel(
                    getBlogsUseCase = GetBlogsUseCase(
                        blogsRepository = BlogRepositoryImpl(
                            remoteDataSource = RemoteDataSourceImpl(travelLogServer = TravelLogServerImpl())
                        )
                    )
                )
            }
        )

        HomeScreen(viewModel = homeScreenViewModel)
    }
}