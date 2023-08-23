package ru.agavrilyuk

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.agavrilyuk.dao.Dao
import ru.agavrilyuk.entity.Customer
import ru.agavrilyuk.entity.Item

@Database(entities = [Item::class], version = 1)
abstract class MainDB : RoomDatabase() {
    abstract fun getDao(): Dao

    companion object {
        fun getDB(context: Context): MainDB {
            return Room.databaseBuilder(
                context.applicationContext,
                MainDB::class.java,
                "test.db"
            ).build()
        }
    }
}