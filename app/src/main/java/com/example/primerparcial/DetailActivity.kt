package com.example.primerparcial
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailActivity  : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val preferences = getSharedPreferences("loginPref", MODE_PRIVATE)
        val userName = preferences.getString("name", "") ?:""

        recyclerView = findViewById(R.id.RecyclerViewClubes)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = Adapter(applicationContext)
        recyclerView.adapter = adapter
        adapter.submitList(getListadoAlumnos(userName))

        adapter.onItemClickListener = {alumnos ->
            val intent = Intent(this,DetailActivityAlumno::class.java)
            intent.putExtra("nombre",alumnos.nombre)
            intent.putExtra("edad",alumnos.edad)
            intent.putExtra("url",alumnos.url)
            startActivity(intent)

        }
    }
    private fun getListadoAlumnos(userName: String): MutableList<Alumnos>? {
        return mutableListOf(
            Alumnos(1, userName, "15","https://www.ole.com.ar/images/2022/12/20/j6Jp23tbn_400x400__1.jpg"),
            Alumnos(2, "Gaby", "13","https://images.dog.ceo/breeds/hound-basset/n02088238_10451.jpg" ),
            Alumnos(3, "Lucas", "14","https://fotos.perfil.com/2022/11/22/lautaro-martinez-1457647.jpg" ),
            Alumnos(4, "Pedro", "14","https://images.dog.ceo/breeds/hound-afghan/n02088094_1003.jpg" ),
            Alumnos(5, "Claudio", "13","https://images.dog.ceo/breeds/hound-afghan/n02088094_10715.jpg" ),
            Alumnos(6, "Claudia", "14","https://images.dog.ceo/breeds/hound-afghan/n02088094_3856.jpg" ),
            Alumnos(7, "Rene", "13","https://images.dog.ceo/breeds/hound-afghan/n02088094_3944.jpg" ),
            Alumnos(8, "Nicolas", "15","https://images.dog.ceo/breeds/hound-afghan/n02088094_5080.jpg" ),
            Alumnos(9, "Alberto", "15","https://images.dog.ceo/breeds/hound-afghan/n02088094_6485.jpg" ),
            Alumnos(10, "Melisa", "13","https://images.dog.ceo/breeds/hound-afghan/n02088094_913.jpg" ),
        )
    }
}