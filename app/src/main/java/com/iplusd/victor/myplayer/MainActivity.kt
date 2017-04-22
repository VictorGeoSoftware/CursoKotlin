package com.iplusd.victor.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val f: (Int) -> Int = { x -> x * x }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = MediaAdapter(fetchMedia()) {
//            item -> showMyToast(item.title)
            showMyToast(it.title)
        }


        val textView = TextView(this).apply2 {
            textSize = 20f
        }

        val viewGroup: ViewGroup = FrameLayout(this)
        val list: List<View> = viewGroup.filterViews { view -> view.visible }
    }






}
