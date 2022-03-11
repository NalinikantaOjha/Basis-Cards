package com.example.devloperdocsonetomany

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.masai.basiscards.ContactDao
import com.masai.basiscards.Playlist
import com.masai.basiscards.User

@Database(entities = [User::class, Playlist::class],version = 1)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun getContactDao(): ContactDao
    companion object{
        private var instance:ContactDatabase?=null
        fun getContactDatabase(context: Context):ContactDatabase{
            if (instance!=null){
                return instance!!
            }else{
                val builder= Room.databaseBuilder(
                    context.applicationContext,
                    ContactDatabase::class.java,
                    "contactDb"
                )
                builder.fallbackToDestructiveMigration()
                instance=builder.build()
            }
            return instance!!
        }
    }
}