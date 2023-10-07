package presentation.screens.homeScreen

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import domain.useCases.GetBlogsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import presentation.screens.homeScreen.state.BlogUiState

class HomeScreenViewModel(private val getBlogsUseCase: GetBlogsUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(BlogUiState())
    val uiState = _uiState.asStateFlow()

    init {
        getBlogs()
    }

    private fun getBlogs() {
        viewModelScope.launch {
            _uiState.update { it.copy(blogs = getBlogsUseCase.invoke()) }
        }
    }
}