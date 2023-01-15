package com.jgenesis.doorstore.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jgenesis.doorstore.data.local.dao.*
import com.jgenesis.doorstore.data.local.entity.*

@Database(
    entities = [
        ProductLocalEntity::class,
        ClientLocalEntity::class,
        SellLocalEntity::class,
        BuyLocalEntity::class,
        SellProductLocalEntity::class
    ],
    version = 5,
    exportSchema = false
)
abstract class Database : RoomDatabase() {
    abstract fun getProductDao(): ProductDao
    abstract fun getClientDao(): ClientDao
    abstract fun getSellDao(): SellDao
    abstract fun getBuyDao(): BuyDao
    abstract fun getSellProduct(): SellProductDao
}
