package com.iplusd.victor.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val title = "Título de prueba"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ediText = findViewById(R.id.editText) as EditText
        val button = findViewById(R.id.button) as Button

//        val titleList:List<String> = listOf("Titulo1", "Titulo2", "Titulo3")
//        val myInt = 20
//        val myLong:Long = myInt.toLong()

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                showMyToast(ediText.text.toString())
            }

        })

    }

// ----- void <=> Unit
//    fun showMyToast(title:String) {
//        Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
//    }
    fun showMyToast(title:String) = Toast.makeText(this, "El texto que pongo => ${title} <=", Toast.LENGTH_SHORT).show()
}
