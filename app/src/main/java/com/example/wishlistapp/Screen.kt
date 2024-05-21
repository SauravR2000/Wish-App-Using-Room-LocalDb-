package com.example.wishlistapp

sealed class Screen(var route: String) {
    object HomeScreen : Screen("home_screen")
    object AddScreen : Screen("add_screen")

}