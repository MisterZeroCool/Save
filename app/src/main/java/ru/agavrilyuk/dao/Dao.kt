package ru.agavrilyuk.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ru.agavrilyuk.entity.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    fun insertItem(item: Item)

    @Query("SELECT item_name FROM item")
    fun getAllItems(): Flow<List<Item>>
}