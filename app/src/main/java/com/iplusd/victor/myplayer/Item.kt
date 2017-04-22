package com.iplusd.victor.myplayer

/**
 * Created by victor! on 22/4/17.
 *
 */
data class Item(val title: String, val url: String, val type:Type) {
    enum class Type { PHOTO, VIDEO }
}