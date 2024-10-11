package com.esdraz.aulafragment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.esdraz.aulafragment.R

class MercadoFragment: Fragment() {

    private lateinit var textCategoria: TextView
    private lateinit var textUsuario: TextView

    private var categoria: String? = null
    private var usuario: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // recuperar os valores passados via argumento
        categoria = arguments?.getString("categoria")
        usuario = arguments?.getString("usuario")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mercado, container, false)

        // processamento da visualizacao
        textCategoria = view.findViewById(R.id.text_categoria)
        textUsuario = view.findViewById(R.id.text_usuario)

        // passando os valores recebidos para os textViews
        textCategoria.text = categoria
        textUsuario.text = usuario

        return view
    }
}