package com.jgenesis.doorstore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jgenesis.doorstore.data.local.entity.ProductLocalEntity

@Dao
interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(product: ProductLocalEntity)

    @Query("SELECT * FROM product ORDER BY product.name ASC")
    suspend fun getAll(): List<ProductLocalEntity>

    @Update
    suspend fun update(product: ProductLocalEntity)
}
