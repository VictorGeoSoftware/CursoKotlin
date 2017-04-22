package com.iplusd.victor.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val f: (Int) -> Int = { x -> x * x }
    val recycler by lazy { find<RecyclerView>(R.id.recycler) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = MediaAdapter() //---> se setea adapter cuando se inicializa, no antes!
    }






}
