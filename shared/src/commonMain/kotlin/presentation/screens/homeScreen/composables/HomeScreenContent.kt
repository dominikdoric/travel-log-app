package presentation.screens.homeScreen.composables

import androidx.compose.runtime.Composable
import presentation.screens.homeScreen.state.BlogUiState

@Composable
fun HomeScreenContent(uiState: BlogUiState) {
    BlogItemsList(blogsList = uiState.blogs)
}