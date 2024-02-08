package com.jetpack.newsapidemo.data.db

import androidx.room.TypeConverter
import com.jetpack.newsapidemo.data.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }
}