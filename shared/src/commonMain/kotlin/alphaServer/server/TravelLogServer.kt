package alphaServer.server

import alphaServer.tables.Blog

interface TravelLogServer {
    fun getBlogs(): List<Blog>
}
