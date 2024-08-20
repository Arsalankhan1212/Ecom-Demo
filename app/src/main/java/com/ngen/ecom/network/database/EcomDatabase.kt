package com.ngen.ecom.network.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ngen.ecom.model.cart.CartItem

@Database(entities = [CartItem::class], version = 1)
abstract class EcomDatabase : RoomDatabase(){
    abstract fun cartDao() : CartDao

    companion object{

        @Volatile
        private var databaseInstance : EcomDatabase ?= null

        fun getInstance(context: Context): EcomDatabase {
            return databaseInstance ?: synchronized(this) {
                databaseInstance ?: buildDatabase(context).also { databaseInstance = it }
            }
        }

        // Create a method to build the database instance
        private fun buildDatabase(context: Context): EcomDatabase {
            return Room.databaseBuilder(context.applicationContext, EcomDatabase::class.java, "cart_db")
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}