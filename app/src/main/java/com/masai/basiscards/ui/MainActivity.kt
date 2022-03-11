package com.masai.basiscards.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.devloperdocsonetomany.ContactDatabase
import com.masai.basiscards.Playlist
import com.masai.basiscards.User
import com.masai.basiscards.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dao = ContactDatabase.getContactDatabase(this).getContactDao()
        CoroutineScope(Dispatchers.IO).launch {
            dao.addUser(User(3L,"NALINI",3,5))
        }
        CoroutineScope(Dispatchers.IO).launch {
            dao.addUser(User(10L,"NALINhghjklI",3,5))
        }
        CoroutineScope(Dispatchers.IO).launch {
            dao.addPlayList(Playlist(3L,4L,"NALINI"))
        }

        dao.getUsersWithPlaylists().observe(this, Observer {
            Log.d("nalini",it[1].user.userId.toString())

        })
    }
}