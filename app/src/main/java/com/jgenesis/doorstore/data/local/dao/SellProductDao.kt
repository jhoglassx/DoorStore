package com.jgenesis.doorstore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jgenesis.doorstore.data.local.entity.SellProductLocalEntity

@Dao
interface SellProductDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(sellProduct: SellProductLocalEntity)

    @Query("SELECT * FROM sell_product ORDER BY sell_product.sell_id ASC")
    suspend fun getAll(): List<SellProductLocalEntity>

    @Update
    suspend fun update(product: SellProductLocalEntity)
}
