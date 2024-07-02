package com.example.totolistapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.totolistapplication.data.Todo
import com.example.totolistapplication.data.TodoDao

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}