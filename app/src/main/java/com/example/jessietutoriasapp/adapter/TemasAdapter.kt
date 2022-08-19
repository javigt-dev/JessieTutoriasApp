package com.example.jessietutoriasapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jessietutoriasapp.R
import com.example.jessietutoriasapp.data.Temas

class TemasAdapter(var listaTemas: ArrayList<Temas>): RecyclerView.Adapter<TemasAdapter.ViewHolder>() {


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        var nombreTema: TextView = view.findViewById(R.id.tv_tema_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflate custom Layout
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.card_tema, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Get the data model based on position

        val tema = listaTemas[position]
        holder.nombreTema.text = tema.tema

    }

    override fun getItemCount(): Int = listaTemas.size
}