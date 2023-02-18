package com.example.recyclerviewfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewfirst.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val view  = binding.root
        setContentView(view)

//        val songs = mutableListOf<String>(,"jhoome jo pathan","","har kisi ko nahi milta","Tum ho","Tum tak","Tera Nasha")
        val songObjects = mutableListOf<Song>()
        for (i in 1..200) songObjects.add(Song("Song $i","this song is $i 00"))
//        var myList = findViewById<TextView>(R.id.myList)
        binding.myList.adapter = OurAdapter(songObjects)
        binding.myList.layoutManager = LinearLayoutManager(this)

    }
}