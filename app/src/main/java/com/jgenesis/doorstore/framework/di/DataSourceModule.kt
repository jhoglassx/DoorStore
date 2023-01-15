package com.jgenesis.doorstore.framework.di

import com.jgenesis.doorstore.data.local.datasource.LocalDataSource
import com.jgenesis.doorstore.data.local.datasource.LocalDataSourceImpl
import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSource
import com.jgenesis.doorstore.data.remote.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    fun bindRemoteDataSource(
        remoteDataSourceImpl: RemoteDataSourceImpl
    ): RemoteDataSource

    @Binds
    fun bindLocalDataSource(
        localDataSource: LocalDataSourceImpl
    ): LocalDataSource
}
