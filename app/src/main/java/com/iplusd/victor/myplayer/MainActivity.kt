package com.iplusd.victor.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reycler = findViewById(R.id.recycler) as RecyclerView
        val text = recycler.find<TextView>(R.id.action0)
        reycler.adapter = MediaAdapter(fetchMedia())

        // ------ funciones reified: inyectas clases!
        startActivity<MainActivity>()
    }


}
