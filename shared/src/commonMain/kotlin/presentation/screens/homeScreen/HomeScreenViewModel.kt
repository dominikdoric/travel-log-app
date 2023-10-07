package presentation.screens.homeScreen

import alphaServer.tables.Blog
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import presentation.screens.homeScreen.state.BlogUiState

class HomeScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(BlogUiState())
    val uiState = _uiState.asStateFlow()

    init {
        getBlog()
    }

    private fun getBlog() {
        viewModelScope.launch { _uiState.update { it.copy(blogs = getBlogs()) } }
    }

    private fun getBlogs(): List<Blog> {
        return listOf(
            Blog(
                id = 1,
                title = "My Trip to Paris",
                content = "I had an amazing time exploring the beautiful city of Paris.",
                location = "Paris, France",
                dateCreated = "2023-09-30 14:30:00",
                placeToVisit = "Eiffel Tower, Louvre Museum, Notre-Dame Cathedral",
                weather = "Sunny with occasional showers",
                budget = "$2000",
                duration = "1 week"
            ),
            Blog(
                id = 2,
                title = "Hiking in the Rocky Mountains",
                content = "Hiking through the Rockies was a thrilling experience with breathtaking views.",
                location = "Rocky Mountains, USA",
                dateCreated = "2023-09-29 10:15:00",
                placeToVisit = "Trailhead, Mountain Peak, Campsite",
                weather = "Cool and clear",
                budget = "$500",
                duration = "3 days"
            ),
            Blog(
                id = 3,
                title = "Exploring Tokyo",
                content = "Tokyo is a vibrant and exciting city with so much to offer.",
                location = "Tokyo, Japan",
                dateCreated = "2023-09-28 09:45:00",
                placeToVisit = "Shibuya Crossing, Tokyo Tower, Tsukiji Fish Market",
                weather = "Partly cloudy",
                budget = "$1500",
                duration = "10 days"
            ),
            Blog(
                id = 4,
                title = "Beach Vacation in Bali",
                content = "Relaxing on the beautiful beaches of Bali was pure bliss.",
                location = "Bali, Indonesia",
                dateCreated = "2023-09-27 16:20:00",
                placeToVisit = "Kuta Beach, Ubud Monkey Forest, Uluwatu Temple",
                weather = "Sunny and humid",
                budget = "$2500",
                duration = "2 weeks"
            ),
            Blog(
                id = 5,
                title = "Adventures in the Amazon Rainforest",
                content = "Exploring the Amazon Rainforest was a once-in-a-lifetime adventure.",
                location = "Amazon Rainforest, Brazil",
                dateCreated = "2023-09-26 11:10:00",
                placeToVisit = "Amazon River, Canopy Walkway, Indigenous Villages",
                weather = "Tropical rainforest climate",
                budget = "$3000",
                duration = "5 days"
            ),
            Blog(
                id = 6,
                title = "Skiing in the Swiss Alps",
                content = "Skiing in the Swiss Alps offered breathtaking mountain views and powder snow.",
                location = "Swiss Alps, Switzerland",
                dateCreated = "2023-09-25 08:45:00",
                placeToVisit = "Ski slopes, Alpine villages, Fondue restaurants",
                weather = "Cold and snowy",
                budget = "$1800",
                duration = "1 week"
            ),
            Blog(
                id = 7,
                title = "Road Trip Across America",
                content = "Crossing the United States by car was an epic journey with diverse landscapes.",
                location = "USA (Cross-Country)",
                dateCreated = "2023-09-24 12:30:00",
                placeToVisit = "National Parks, Route 66, Major Cities",
                weather = "Varied by region",
                budget = "$3500",
                duration = "3 weeks"
            ),
            Blog(
                id = 8,
                title = "Cultural Immersion in Kyoto",
                content = "Kyoto's rich history and traditions made for a captivating cultural experience.",
                location = "Kyoto, Japan",
                dateCreated = "2023-09-23 15:20:00",
                placeToVisit = "Temples, Tea Houses, Geisha Districts",
                weather = "Mild and pleasant",
                budget = "$2200",
                duration = "2 weeks"
            ),
            Blog(
                id = 9,
                title = "African Safari Adventure",
                content = "Witnessing Africa's wildlife on safari was an awe-inspiring adventure.",
                location = "Serengeti National Park, Tanzania",
                dateCreated = "2023-09-22 14:00:00",
                placeToVisit = "Wildlife Safaris, Maasai Villages, Ngorongoro Crater",
                weather = "Savannah climate",
                budget = "$4000",
                duration = "1 week"
            ),
            Blog(
                id = 10,
                title = "Historical Tour of Rome",
                content = "Exploring the ancient ruins of Rome offered a glimpse into the past.",
                location = "Rome, Italy",
                dateCreated = "2023-09-21 09:00:00",
                placeToVisit = "Colosseum, Roman Forum, Vatican City",
                weather = "Mild and sunny",
                budget = "$1600",
                duration = "5 days"
            )
        )
    }
}