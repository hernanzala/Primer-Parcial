package com.example.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: TextView
    private lateinit var btnSiguiente: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSiguiente = findViewById(R.id.btnSiguiente)
        editTextName = findViewById(R.id.editTextName)

        btnSiguiente.setOnClickListener {

            if (editTextName.text.isNullOrEmpty()){
                Toast.makeText(this, "Ingrese nombre del alumno", Toast.LENGTH_SHORT).show()

            }else{
                val userName = editTextName.text.toString()

                val preferences = getSharedPreferences("loginPref", MODE_PRIVATE)
                val editor = preferences.edit().putString("name",userName)

                editor.apply()

                val intent = Intent(this, DetailActivity::class.java)
                startActivity(intent)
            }
        }
    }
}