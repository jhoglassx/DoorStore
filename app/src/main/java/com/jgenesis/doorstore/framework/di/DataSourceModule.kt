package com.jgenesis.doorstore.framework.di

import com.jgenesis.doorstore.data.local.datasource.*
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
    fun bindProductLocalDataSource(
        productLocalDataSource: ProductLocalDataSourceImpl
    ): ProductLocalDataSource

    @Binds
    fun bindClientLocalDataSource(
        clientLocalDataSource: ClientLocalDataSourceImpl
    ): ClientLocalDataSource

    @Binds
    fun bindSellLocalDataSource(
        sellLocalDataSource: SellLocalDataSourceImpl
    ): SellLocalDataSource

    @Binds
    fun bindBuyLocalDataSource(
        buyLocalDataSource: BuyLocalDataSourceImpl
    ): BuyLocalDataSource

    @Binds
    fun bindSellProductLocalDataSource(
        sellProductLocalDataSource: SellProductLocalDataSourceImpl
    ): SellProductLocalDataSource
}

