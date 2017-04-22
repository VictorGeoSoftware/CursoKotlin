package com.iplusd.victor.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.iplusd.victor.myplayer.MediaProvider.dataAsync
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates

object MyObject //----> clase que sólo tiene una instancia => singelton

class MainActivity : AppCompatActivity() {

    companion object {
        val x = 20
        val REQUEST_CAMERA = "REQUEST_CAMERA"
    }


    val adapter = MediaAdapter{showMyToast(it.title)}

    val f: (Int) -> Int = { x -> x * x }
    // ----- observable
    val observedNumber by Delegates.observable(0) { // ------> el 0 es el valor con el que inicializas la variable
        p, old, new -> Log.d("CursoKotlin", "old value: $old, - new value: $new")
    }
    // ----- vetoable :: impide que una variable se seté por una determinada condición

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycler.adapter = adapter

        dataAsync { items ->
            adapter.data = items
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        progress.visible(true)
        dataAsync {items ->
            adapter.data = when (item.itemId) {
                R.id.filter_photos -> items.filter { it.type == Item.Type.PHOTO }
                R.id.filter_videos -> items.filter { it.type == Item.Type.VIDEO }
                else -> items
            }

            progress.visible(false)
        }

        return true
    }




}
