package com.iplusd.victor.myplayer

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.view_media_item.view.*
import kotlin.properties.Delegates

/**
 * Created by victor on 22/4/17.
 *
 */

class MediaAdapter(val listener: (Item) -> Unit) : RecyclerView.Adapter<MediaAdapter.RowViewHolder>() {

//    var data: List<Item> = emptyList()
    var data by Delegates.observable(emptyList()) {
        p, old:List<Item>, new:List<Item> -> { notifyDataSetChanged() }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val view = parent.inflate(R.layout.view_media_item)
        return RowViewHolder(view)
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        holder.bind(data[position])
        holder.itemView.setOnClickListener{ listener(data[position]) }
    }

    override fun getItemCount() = data.size


    class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Item) {
            with(itemView) {
                media_title.text = item.title
                media_thumb.loadUrl(item.url)
                media_video_indicator.visible(item.type == Item.Type.VIDEO)
            }
        }
    }

}