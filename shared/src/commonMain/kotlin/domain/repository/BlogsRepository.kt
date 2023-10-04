package domain.repository

import alphaServer.tables.Blog
import domain.model.BlogDomain

interface BlogsRepository {
    fun getBlog(): Blog
    fun getBlogs(): List<BlogDomain>
}