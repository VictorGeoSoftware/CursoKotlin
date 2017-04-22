package com.iplusd.victor.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val title = "Título de prueba"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reycler = findViewById(R.id.recycler) as RecyclerView
        reycler.adapter = MediaAdapter(fetchMedia())

    }

    fun showMyToast(title:String) = Toast.makeText(this, "El texto que pongo => ${title} <=", Toast.LENGTH_SHORT).show()
}
