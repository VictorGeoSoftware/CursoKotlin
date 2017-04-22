package com.iplusd.victor.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    val f: (Int) -> Int = { x -> x * x }
    // ----- observable
    val observedNumber by Delegates.observable(0) { // ------> el 0 es el valor con el que inicializas la variable
        p, old, new -> Log.d("CursoKotlin", "old value: $old, - new value: $new")
    }
    // ----- vetoable :: impide que una variable se seté por una determinada condición

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MediaAdapter{showMyToast(it.title)}
        recycler.adapter = adapter

        adapter.data = fetchMedia()

//        val lazyVar by lazy {  }  -----> También para variables
    }






}
