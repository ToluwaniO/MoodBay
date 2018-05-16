package com.example.oguns.moodbay.model

data class Media(var mediaUrl: String = "", var mediaType: Type = Type.IMAGE)

enum class Type {
    IMAGE , VIDEO
}