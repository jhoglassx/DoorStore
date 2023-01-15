package com.jgenesis.doorstore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jgenesis.doorstore.data.local.entity.ClientLocalEntity

@Dao
interface ClientDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(client: ClientLocalEntity)

    @Query("SELECT * FROM client ORDER BY client.name ASC")
    suspend fun getAll(): List<ClientLocalEntity>

    @Update
    suspend fun update(client: ClientLocalEntity)
}
