package com.example.oguns.moodbay.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.oguns.moodbay.datasource.DbContract

@Entity(tableName = DbContract.POST_TABLE_NAME)
data class Post(var userName: String = "", var uid: String, @Embedded var media: Media,
                var time: Long = System.currentTimeMillis(), @PrimaryKey var key: String = "")
