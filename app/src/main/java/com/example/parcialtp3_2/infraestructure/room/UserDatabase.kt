package com.example.parcialtp3_2.infraestructure.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [UserEntity::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL(
            "ALTER TABLE users ADD COLUMN mobile_number TEXT NOT NULL DEFAULT ''"
        )
        db.execSQL(
            "ALTER TABLE users ADD COLUMN birth_date TEXT NOT NULL DEFAULT ''"
        )
    }
}