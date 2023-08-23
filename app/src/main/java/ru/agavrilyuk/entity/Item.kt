package ru.agavrilyuk.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")
data class Item(
    @PrimaryKey(autoGenerate = true)
    private var id: Long? = null,

    @ColumnInfo(name = "item_name")
    val itemName: String,

    @ColumnInfo(name = "price")
    var price: String,
    )
