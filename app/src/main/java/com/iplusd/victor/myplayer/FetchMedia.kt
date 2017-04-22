package com.iplusd.victor.myplayer

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * Created by victor! on 22/4/17.
 *
 */


object MediaProvider {

    fun dataAsync(f:(List<Item>) -> Unit) {
        doAsync {
            val data = fetchMedia()
            Thread.sleep(2000)

            uiThread {
                f(data)
            }
        }
    }
    val data by lazy { fetchMedia() }  // hasta que no se pide, no se crea la vriable!!!


    fun fetchMedia(): List<Item> = (1..10).map {
        Item(
                it,
                "Title $it",
                "http://lorempixel.com/400/400/sports/$it/",
                if (it % 3 == 0) Item.Type.VIDEO else Item.Type.PHOTO
        )
    }


    fun test() {
        val list = listOf<Int>(1, 4, 3, 2)
        val newList = list.filter { it %2 == 0 }
                .sorted()
//            .sortedBy { Int::toString }
                .map { "Title $it" }
    }
}

