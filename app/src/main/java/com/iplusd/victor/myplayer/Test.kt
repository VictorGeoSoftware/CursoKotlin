package com.iplusd.victor.myplayer

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by victor on 22/4/17.
 *
 */


fun test (view:View) {
    when (view) {
        is TextView -> print(view.text)
        is ViewGroup -> print("children: ${view.childCount}")
    }

    val int = 10
    when (int) {
        in 5..20 -> ""
        0 -> ""
        1, 3, 5 -> ""
    }


    val result:Any = when (int) {
        in 5..20 -> ""
        0 -> 2
        1, 3, 5 -> ""
        else -> ""
    }
}