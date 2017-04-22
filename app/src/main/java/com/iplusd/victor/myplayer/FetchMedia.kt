package com.iplusd.victor.myplayer

/**
 * Created by victor! on 22/4/17.
 *
 */

fun fetchMedia2():ArrayList<Item> = arrayListOf(
        Item("Title1", "http://lorempixel.com/400/400/sports/1/", Item.Type.VIDEO),
        Item("Title", "http://lorempixel.com/400/400/sports/2/", Item.Type.PHOTO),
        Item("Title3", "http://lorempixel.com/400/400/sports/3/", Item.Type.VIDEO),
        Item("Title4", "http://lorempixel.com/400/400/sports/4/", Item.Type.PHOTO),
        Item("Title5", "http://lorempixel.com/400/400/sports/5/", Item.Type.VIDEO),
        Item("Title6", "http://lorempixel.com/400/400/sports/6/", Item.Type.PHOTO),
        Item("Title7", "http://lorempixel.com/400/400/sports/7/", Item.Type.VIDEO),
        Item("Title9", "http://lorempixel.com/400/400/sports/9/", Item.Type.PHOTO),
        Item("Title10", "http://lorempixel.com/400/400/sports/10/", Item.Type.VIDEO)
)

fun fetchMedia(): List<Item> = (1..10).map {
    Item(
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