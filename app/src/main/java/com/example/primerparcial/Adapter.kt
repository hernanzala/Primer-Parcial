package com.example.primerparcial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter (val context: Context) : ListAdapter<Alumnos, Adapter.ViewHolder>(DiffCallBack) {

    lateinit var onItemClickListener: (Alumnos) -> Unit

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val nombre : TextView = view.findViewById(R.id.txtNombre)
        private val edad : TextView = view.findViewById(R.id.txtEdad)
        private val fotoAlumno: ImageView = view.findViewById(R.id.imgView)

        fun bind (alumnos: Alumnos) {
            nombre.text = alumnos.nombre.toString()
            edad.text = "Edad:" + alumnos.edad.toString()

            Glide.with(context)
                .load(alumnos.url)
                .into(fotoAlumno)

            view.setOnClickListener {
                onItemClickListener(alumnos)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.itemlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val alumnos = getItem(position)
        holder.bind(alumnos)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Alumnos>() {
        override fun areItemsTheSame(oldItem: Alumnos, newItem: Alumnos): Boolean {
            return  oldItem.id == newItem.id
        }
        override fun areContentsTheSame(oldItem: Alumnos, newItem: Alumnos): Boolean {
            return oldItem == newItem
        }
    }
}