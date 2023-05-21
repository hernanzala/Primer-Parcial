package com.example.primerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivityAlumno : AppCompatActivity() {

    private lateinit var textViewName: TextView
    private lateinit var textViewAge: TextView
    private lateinit var  ImagenView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_alumno)

        textViewName = findViewById(R.id.txtNombreGrande)
        textViewAge = findViewById(R.id.txtEdadGrande)
        ImagenView = findViewById(R.id.imgAlumnoGrande)

        val bundle = intent.extras
        val nombre = bundle?.getString("nombre","")
        val edad = bundle?.getString("edad","")
        val url = bundle?.getString("url") ?:""

        textViewName.text = nombre
        textViewAge.text = edad

        Glide.with(applicationContext)
            .load(url)
            .into(ImagenView)
    }
}