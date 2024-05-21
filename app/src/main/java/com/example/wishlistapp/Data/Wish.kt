package com.example.wishlistapp.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)


object DummyWish {
    val wishList = listOf(
        Wish(id = 1L, title = "Wish 1", description = "Description of Wish 1"),
        Wish(id = 2L, title = "Wish 2", description = "Description of Wish 2"),
        Wish(id = 3L, title = "Wish 3", description = "Description of Wish 3"),
        Wish(id = 4L, title = "Wish 4", description = "Description of Wish 4"),
        Wish(id = 5L, title = "Wish 5", description = "Description of Wish 5"),
        Wish(id = 6L, title = "Wish 6", description = "Description of Wish 6"),
        Wish(id = 7L, title = "Wish 7", description = "Description of Wish 7"),
        Wish(id = 8L, title = "Wish 8", description = "Description of Wish 8"),
        Wish(id = 9L, title = "Wish 9", description = "Description of Wish 9"),
        Wish(id = 10L, title = "Wish 10", description = "Description of Wish 10")
    )

}