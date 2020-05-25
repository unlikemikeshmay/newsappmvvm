package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.androiddevs.mvvmnewsapp.data.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source):String {
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name,name)
    }

}