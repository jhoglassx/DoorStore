package com.jgenesis.doorstore.framework.di

import com.jgenesis.doorstore.data.local.database.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {

    @Provides
    fun provideProductDao(database: Database) = database.getProductDao()

    @Provides
    fun provideClientDao(database: Database) = database.getClientDao()

    @Provides
    fun provideSellDao(database: Database) = database.getSellDao()

    @Provides
    fun provideBuyDao(database: Database) = database.getBuyDao()

    @Provides
    fun provideSellProduct(database: Database) = database.getSellProduct()
}
