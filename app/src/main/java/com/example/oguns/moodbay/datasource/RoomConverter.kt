package com.example.oguns.moodbay.datasource

import androidx.room.TypeConverter
import com.example.oguns.moodbay.model.Type

class RoomConverter {

    @TypeConverter
    fun convertFromType(type: Type): String {
        return when(type) {
            Type.IMAGE -> "image"
            Type.VIDEO -> "video"
        }
    }

    @TypeConverter
    fun convertToType(typeString: String): Type {
        return when(typeString) {
            "image" -> Type.IMAGE
            "video" -> Type.VIDEO
            else -> Type.IMAGE
        }
    }

}