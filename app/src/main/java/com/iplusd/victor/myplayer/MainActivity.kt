package com.iplusd.victor.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.iplusd.victor.myplayer.MediaProvider.dataAsync
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates
import org.jetbrains.anko.startActivity

object MyObject //----> clase que sólo tiene una instancia => singelton

class MainActivity : AppCompatActivity() {

    companion object {
        val x = 20
        val REQUEST_CAMERA = "REQUEST_CAMERA"
    }


    val adapter = MediaAdapter {
        startActivity<DetailActivity>(DetailActivity.EXTRA_ITEM_ID to it.id)
    }

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

        val filter = when (item.itemId) {
            R.id.filter_photos -> Filter.ByType(Item.Type.PHOTO)
            R.id.filter_videos -> Filter.ByType(Item.Type.PHOTO)
            else -> Filter.None
        }

        MediaProvider.dataAsync { items ->
            adapter.data = when(filter) {
                is Filter.ByType -> items.filter { it.type == filter.type }
                is Filter.None -> items
            }
        }

        return true
    }




}
