package com.jgenesis.doorstore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jgenesis.doorstore.data.local.entity.SellCrossRef
import com.jgenesis.doorstore.data.local.entity.SellLocalEntity

@Dao
interface SellDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(sell: SellLocalEntity)

    @Query("SELECT * FROM sell ORDER BY sell.id ASC")
    suspend fun getAll(): List<SellCrossRef>

    @Update
    suspend fun update(products: SellLocalEntity)
}
