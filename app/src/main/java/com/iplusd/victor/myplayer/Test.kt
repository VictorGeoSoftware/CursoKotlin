package com.iplusd.victor.myplayer

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by victor on 22/4/17.
 *
 */


fun test (view:View) {
    val int = 10

    val list = listOf<Int>(1, 2, 3)

    for (item in list) {}
    // rangos
    for (i in 1..10) {} // hasta 10
    for (i in 1 until 10) {} // hasta 9

    when (int) {
        in 5..20 -> ""
        0 -> ""
        1, 3, 5 -> ""
    }

    when (view) {
        is TextView -> print(view.text)
        is ViewGroup -> print("children: ${view.childCount}")
    }

    when {
        view is TextView -> print(view.text)
        System.currentTimeMillis() > 0 -> ""
        int in 30..40 -> print("")
    }

    val result:Any = when (int) {
        in 5..20 -> ""
        0 -> 2
        1, 3, 5 -> ""
        else -> IllegalStateException("No es un valor válido")
    }
}