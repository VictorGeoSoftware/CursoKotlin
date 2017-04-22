package com.iplusd.victor.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reycler = findViewById(R.id.recycler) as RecyclerView
//        val text = reycler.find<TextView>(R.id.action0)
        reycler.adapter = MediaAdapter(fetchMedia())

        // ------ funciones reified: inyectas clases!
        startActivity<MainActivity>()
    }


}
