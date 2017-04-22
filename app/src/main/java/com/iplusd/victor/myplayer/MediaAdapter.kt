package com.iplusd.victor.myplayer

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

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
        val title = itemView.find<TextView>(R.id.media_title)
        val thumb = itemView.find<ImageView>(R.id.media_thumb)
        val mediaIndicator = itemView.find<ImageView>(R.id.media_video_indicator)

        fun bind(item: Item) {
            title.text = item.title
            thumb.loadUrl(item.url)
            mediaIndicator.visible(Item.Type.VIDEO == Item.Type.VIDEO)
            itemView.setOnClickListener { toast(item.title) }
        }
    }
}