package com.iplusd.victor.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    companion object {
        val EXTRA_ITEM_ID = "EXTRA_ITEM_ID"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra(EXTRA_ITEM_ID, -1)
        val item = MediaProvider.fetchMedia().firstOrNull { it.id == id }

        // Uso del "let"
//        item?.let {
//            supportActionBar?.title = item.title
//            detail_thumb.loadUrl(item.url)
//            detail_video_indicator.visible = item.type == Item.Type.VIDEO
//        }

        item?.apply {
            supportActionBar?.title = title
            detail_thumb.loadUrl(url)
            detail_video_indicator.visible = type == Item.Type.VIDEO
        }
    }
}
