package com.example.wishlistapp


import com.example.wishlistapp.Data.WishDatabase
import WishRepository
import android.content.Context
import android.util.Log
import androidx.room.Room

object Graph {
    private lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context) {
        val dbName = "wishlist.db"

        Log.i("TAG", "provide: saurav created database")
        Log.i("context ?", "saurav context = $context")
        Log.i("context ?", "saurav class = ${(WishDatabase::class.java)}")
        Log.i("context ?", "saurav dbname = $dbName")



        database = Room.databaseBuilder(
            context = context,
            klass = WishDatabase::class.java,
            name = dbName,
        ).build()
        Log.i("TAG", "provide: saurav created database 2")
    }
}