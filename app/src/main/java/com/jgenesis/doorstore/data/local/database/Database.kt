package com.jgenesis.doorstore.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jgenesis.doorstore.data.local.dao.ProductDao
import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity

@Database(
    entities = [
        ProductLocalEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class Database : RoomDatabase() {
    abstract fun getProductDao(): ProductDao
}
