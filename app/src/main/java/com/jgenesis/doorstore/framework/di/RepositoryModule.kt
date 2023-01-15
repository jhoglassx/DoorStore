package com.jgenesis.doorstore.framework.di

import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSource
import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSourceImpl
import com.jgenesis.doorstore.data.repository.Repository
import com.jgenesis.doorstore.data.repository.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindRemoteDataSource(
        remoteDataSourceImpl: RemoteDataSourceImpl
    ): RemoteDataSource

    @Binds
    fun bindProductRepository(
        repository: RepositoryImpl
    ): Repository
}
