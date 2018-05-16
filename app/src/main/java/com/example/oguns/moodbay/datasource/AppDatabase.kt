package com.example.oguns.moodbay.datasource

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.oguns.moodbay.model.Post

@Database(entities = arrayOf(Post::class), version = 1)
@TypeConverters(RoomConverter::class)
abstract class AppDatabase() : RoomDatabase() {

    abstract fun postDao(): PostDao

    companion object {
        private var dbInstance: AppDatabase? = null

        fun getDbInstance(context: Context): AppDatabase?{
            if(dbInstance == null){
                synchronized(this) {
                    if (dbInstance == null) {
                        dbInstance = Room.databaseBuilder(context, AppDatabase::class.java,
                                DbContract.DB_NAME).build()
                    }
                }
            }
            return dbInstance
        }

        fun destroyDbInstance(){
            dbInstance = null
        }
    }

}