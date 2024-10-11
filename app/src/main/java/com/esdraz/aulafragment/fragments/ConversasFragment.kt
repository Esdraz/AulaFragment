package com.esdraz.aulafragment.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.esdraz.aulafragment.R
import com.google.android.material.textfield.TextInputEditText

//class ConversasFragment : Fragment(R.layout.fragment_conversas) {
class ConversasFragment : Fragment() {

    private lateinit var textNome: TextInputEditText
    private lateinit var textResultado: TextView
    private lateinit var btnExecutar: Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida", "Fragment onCreateView")

        // inflar a View usando o layout
        val view = inflater.inflate(R.layout.fragment_conversas, container, false)

        // processamento da visualizacao
        textNome = view.findViewById(R.id.text_nome)
        textResultado = view.findViewById(R.id.text_resultado)
        btnExecutar = view.findViewById(R.id.btn_executar)


        btnExecutar.setOnClickListener {
            textResultado.text = textNome.text.toString()
        }

        return view
    }

//    Depreciado
/*    override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo_vida", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo_vida", "Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo_vida", "Fragment onDetach")
    }
}