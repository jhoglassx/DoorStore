package com.jgenesis.doorstore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jgenesis.doorstore.data.local.entity.BuyLocalEntity

@Dao
interface BuyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(buy: BuyLocalEntity)

    @Query("SELECT * FROM buy ORDER BY buy.id ASC")
    suspend fun getAll(): List<BuyLocalEntity>

    @Update
    suspend fun update(buy: BuyLocalEntity)
}
