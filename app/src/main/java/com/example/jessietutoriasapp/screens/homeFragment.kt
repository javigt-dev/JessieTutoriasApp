package com.example.jessietutoriasapp.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jessietutoriasapp.R
import com.example.jessietutoriasapp.adapter.TemasAdapter
import com.example.jessietutoriasapp.data.Temas
import com.example.jessietutoriasapp.databinding.FragmentHomeBinding

class homeFragment : Fragment() {

    private lateinit var mBinding: FragmentHomeBinding
    private lateinit var temasAdapter: TemasAdapter
    private lateinit var recyclerView: RecyclerView
    private var newArrayTemas = arrayListOf<Temas>()
    private lateinit var temasTitulo:  Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        temasRandom()
        val layoutManager = GridLayoutManager(context, 2)
        recyclerView = view.findViewById(R.id.rv_categories)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        temasAdapter = TemasAdapter(newArrayTemas)
        recyclerView.adapter = temasAdapter
    }

    private fun temasRandom(){

        newArrayTemas = arrayListOf()

        temasTitulo = arrayOf(
            "Geometria",
            "Trigonometria",
            "Funciones",
            "Aritmentica",
            "Factorizacion",
            "Problemas",
            "Verticalizacion",
            "Optiomizacion"
        )

        for (i in temasTitulo){
            val titulo = Temas(i)
            newArrayTemas.add(titulo)
        }
    }
}