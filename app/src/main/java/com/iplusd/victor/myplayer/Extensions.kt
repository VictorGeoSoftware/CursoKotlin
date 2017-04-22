package com.iplusd.victor.myplayer

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.annotation.IdRes
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by victor on 22/4/17.
 *
 */

// -----> Parámetro por defecto! length:Int = Toast.LENGTH_SHORT
fun Context.showMyToast(title:String, length:Int = Toast.LENGTH_SHORT) = Toast.makeText(this, "El texto que pongo => ${title} <=", length).show()

fun RecyclerView.ViewHolder.toast(message:String, length:Int = Toast.LENGTH_SHORT) { itemView.context.showMyToast(message, length) }

fun ViewGroup.inflate(@LayoutRes resource:Int, attachToRoot:Boolean = false):View = LayoutInflater.from(context).inflate(resource, this, attachToRoot)

fun ImageView.loadUrl(url:String) = Picasso.with(context).load(url).into(this)

// ------ funciones reified
inline fun <reified T : Activity> Context.startActivity() {
    startActivity(Intent(this, T::class.java))
}

inline fun <reified T : View> View.find(@IdRes id:Int): T {
    return findViewById(id) as T
}

inline fun <reified T : View> RecyclerView.ViewHolder.find(@IdRes id:Int): View {
    return itemView.find<T>(id)
}
