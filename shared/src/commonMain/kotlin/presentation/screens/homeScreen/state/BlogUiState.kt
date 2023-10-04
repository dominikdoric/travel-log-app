package presentation.screens.homeScreen.state

data class BlogUiState(
    val id: Int = 0,
    val title: String = "",
    val content: String = "",
    val location: String = "",
    val dateCreated: String = "",
    val placeToVisit: String = "",
    val weather: String = "",
    val budget: String = "",
    val duration: String = ""
)
