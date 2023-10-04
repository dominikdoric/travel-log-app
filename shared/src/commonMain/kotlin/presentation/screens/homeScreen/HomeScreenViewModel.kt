package presentation.screens.homeScreen

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import presentation.screens.homeScreen.state.BlogUiState

class HomeScreenViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(BlogUiState())
    val uiState = _uiState.asStateFlow()

    fun getBlog() {
        viewModelScope.launch {  }

    }
}