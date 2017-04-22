package com.iplusd.victor.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.view_media_item.view.*

/**
 * Created by victor on 22/4/17.
 *
 */

class MediaAdapter(val data: ArrayList<Item>) : RecyclerView.Adapter<MediaAdapter.RowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val view = parent.inflate(R.layout.view_media_item)
        return RowViewHolder(view)
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size


    class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Item) {
            itemView.media_title.text = item.title
            itemView.media_thumb.loadUrl(item.url)
            itemView.media_video_indicator.visible(item.type == Item.Type.VIDEO)
            itemView.setOnClickListener { toast(item.title) }

        }
    }
}