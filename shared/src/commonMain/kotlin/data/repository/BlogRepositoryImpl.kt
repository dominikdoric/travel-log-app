package data.repository

import data.remote.RemoteDataSource
import domain.model.toBlogDomain
import domain.repository.BlogsRepository

class BlogRepositoryImpl(private val remoteDataSource: RemoteDataSource) : BlogsRepository {
    override suspend fun getBlogs() = remoteDataSource.getBlogs().map { it.toBlogDomain() }
}