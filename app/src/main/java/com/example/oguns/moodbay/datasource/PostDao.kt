package com.example.oguns.moodbay.datasource

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.oguns.moodbay.model.Post

@Dao
public interface PostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun insertPost(post: Post)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun insertPosts(posts: List<Post>)

    @Query("SELECT * FROM ${DbContract.POST_TABLE_NAME}")
    public fun getPosts(): LiveData<List<Post>>

    @Delete()
    fun deletePost(post: Post)

    @Query("DELETE FROM ${DbContract.POST_TABLE_NAME}")
    fun nukeTable()
}