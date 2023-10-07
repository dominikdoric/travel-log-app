package domain.repository

import domain.model.BlogDomain

interface BlogsRepository {
    suspend fun getBlogs(): List<BlogDomain>
}