package com.example.wishlistapp

import android.app.Application
import android.util.Log

class WishListApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("TAG", "onCreate: saurav")
        Graph.provide(this)
        Log.i("TAG", "onCreate: saurav 2")
    }
}