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
    suspend fun insert(products: ProductLocalEntity)

    @Query("SELECT * FROM product ORDER BY product.name ASC")
    suspend fun getAll(): List<ProductLocalEntity>

    @Update
    suspend fun update(products: ProductLocalEntity)

//    @Query("UPDATE item SET current_quantity = quantity where fiscal_document_id = :fiscalDocumentId")
//    suspend fun updateCurrentQuantityValue(fiscalDocumentId: String)

//    @Query("SELECT * FROM item where fiscal_document_id = :fiscalDocumentId")
//    suspend fun getItemsByFiscalDocumentId(fiscalDocumentId: String): List<ProductLocalEntity>

//    @Query("SELECT * FROM item where fiscal_document_id = :fiscalDocumentId")
//    suspend fun getItemsPackageContainerByFiscalDocumentId(fiscalDocumentId: String): List<ItemPackageContainerCrossRef>
}
