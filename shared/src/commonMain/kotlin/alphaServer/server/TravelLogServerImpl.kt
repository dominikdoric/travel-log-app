package alphaServer.server

import alphaServer.tables.Blog

class TravelLogServerImpl : TravelLogServer {
    override suspend fun getBlogs(): List<Blog> {
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
            ),
            Blog(
                id = 11,
                title = "Island Paradise in Maldives",
                content = "The Maldives is a true paradise with its crystal-clear waters and overwater bungalows.",
                location = "Maldives",
                dateCreated = "2023-09-20 13:45:00",
                placeToVisit = "Overwater bungalow, Coral reefs, Male City",
                weather = "Tropical climate",
                budget = "$3500",
                duration = "1 week"
            ),
            Blog(
                id = 12,
                title = "Camping in Yosemite National Park",
                content = "Camping in Yosemite offered stunning views of waterfalls and starry skies.",
                location = "Yosemite National Park, USA",
                dateCreated = "2023-09-19 10:30:00",
                placeToVisit = "Yosemite Falls, Half Dome, Glacier Point",
                weather = "Mountain climate",
                budget = "$700",
                duration = "4 days"
            ),
            Blog(
                id = 13,
                title = "Exploring the Great Wall of China",
                content = "Walking along the Great Wall provided a sense of awe and history.",
                location = "Beijing, China",
                dateCreated = "2023-09-18 11:15:00",
                placeToVisit = "Great Wall, Forbidden City, Temple of Heaven",
                weather = "Varied by season",
                budget = "$1800",
                duration = "1 week"
            ),
            Blog(
                id = 14,
                title = "Wildlife Safari in Kenya",
                content = "Kenya's national parks teem with magnificent wildlife on safari.",
                location = "Maasai Mara National Reserve, Kenya",
                dateCreated = "2023-09-17 14:20:00",
                placeToVisit = "Safari game drives, Maasai villages, Mara River",
                weather = "Savannah climate",
                budget = "$3000",
                duration = "2 weeks"
            ),
            Blog(
                id = 15,
                title = "Scenic Views in Santorini",
                content = "Santorini's stunning sunsets and cliffside views are unforgettable.",
                location = "Santorini, Greece",
                dateCreated = "2023-09-16 16:10:00",
                placeToVisit = "Oia, Fira, Amoudi Bay",
                weather = "Mediterranean climate",
                budget = "$2500",
                duration = "1 week"
            ),
            Blog(
                id = 16,
                title = "Adventure in the Australian Outback",
                content = "Exploring the vast Australian Outback is an adventure like no other.",
                location = "Australian Outback",
                dateCreated = "2023-09-15 09:30:00",
                placeToVisit = "Uluru, Kakadu National Park, Alice Springs",
                weather = "Desert climate",
                budget = "$2800",
                duration = "2 weeks"
            ),
            Blog(
                id = 17,
                title = "Historical Journey in Athens",
                content = "Athens is a treasure trove of ancient history and archaeological wonders.",
                location = "Athens, Greece",
                dateCreated = "2023-09-14 12:45:00",
                placeToVisit = "Acropolis, Parthenon, Plaka District",
                weather = "Mild and sunny",
                budget = "$1500",
                duration = "5 days"
            ),
            Blog(
                id = 18,
                title = "Trekking in the Himalayas",
                content = "Trekking in the Himalayas offers breathtaking mountain scenery and spiritual experiences.",
                location = "Himalayas, Nepal",
                dateCreated = "2023-09-13 08:00:00",
                placeToVisit = "Annapurna Base Camp, Everest Base Camp, Kathmandu",
                weather = "Mountain climate",
                budget = "$2000",
                duration = "3 weeks"
            ),
            Blog(
                id = 19,
                title = "Relaxation in the Malibu Coastline",
                content = "The Malibu coastline is perfect for relaxation and beachside activities.",
                location = "Malibu, California, USA",
                dateCreated = "2023-09-12 14:15:00",
                placeToVisit = "Zuma Beach, Malibu Pier, Malibu Creek State Park",
                weather = "Sunny and coastal",
                budget = "$1200",
                duration = "1 week"
            ),
            Blog(
                id = 20,
                title = "Cultural Heritage in Istanbul",
                content = "Istanbul's rich cultural heritage is a blend of history, architecture, and delicious cuisine.",
                location = "Istanbul, Turkey",
                dateCreated = "2023-09-11 11:30:00",
                placeToVisit = "Hagia Sophia, Blue Mosque, Grand Bazaar",
                weather = "Mild and Mediterranean",
                budget = "$1700",
                duration = "10 days"
            )

        )
    }
}