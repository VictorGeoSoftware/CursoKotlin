package com.iplusd.victor.myplayer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

/**
 * Created by victor on 22/4/17.
 */

class MediaAdapter(val data: ArrayList<Item>) : RecyclerView.Adapter<MediaAdapter.RowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_media_item, parent, false)
        return RowViewHolder(view)
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size


    class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById(R.id.media_title) as TextView
        val thumb = itemView.findViewById(R.id.media_thumb) as ImageView

        fun bind(item: Item) {
            title.text = item.title
            Picasso.with(itemView.context).load(item.url).into(thumb)
        }
    }
}