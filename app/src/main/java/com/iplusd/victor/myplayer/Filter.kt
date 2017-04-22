package com.iplusd.victor.myplayer

import android.graphics.Path

/**
 * Created by victor on 22/4/17.
 *
 */


sealed class Filter {
    object None:Filter()
    class ByType(val type: Item.Type) : Filter()
}

sealed class Option {
    object None:Option()
    class Some(val value:Int) : Option()
}

fun test3(option: Option) {
    when (option) {
        is Option.Some -> print("value ${option.value}")
        is Option.None -> print("Empty option")
    }
}