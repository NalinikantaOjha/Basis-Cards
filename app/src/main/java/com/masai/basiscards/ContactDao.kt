package com.masai.basiscards

import androidx.lifecycle.LiveData
import androidx.room.*
import com.masai.basiscards.Playlist
import com.masai.basiscards.User
import com.masai.basiscards.UserWithPlaylists

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend    fun addUser(user: User)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend    fun addPlayList(playlist: Playlist)
    @Transaction
    @Query("SELECT * FROM User")
    fun getUsersWithPlaylists(): LiveData<List<UserWithPlaylists>>
    @Query("select * from User")
    fun getContacts(): LiveData<List<UserWithPlaylists>>
}