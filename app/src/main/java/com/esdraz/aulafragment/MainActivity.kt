package com.esdraz.aulafragment

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.esdraz.aulafragment.fragments.ChamadasFragment
import com.esdraz.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button
    private lateinit var btnRemoverFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)
        btnRemoverFragment = findViewById(R.id.btn_remover_fragment)

//        val fragmentManager = supportFragmentManager.beginTransaction()
//        fragmentManager.add(R.id.fragment_conteudo, ConversasFragment())
//        fragmentManager.commit()

        //instanciando o conversasFragment para poder remover com o .remove no btnChamadas
        val conversasFragment = ConversasFragment()
        val chamadasFragment = ChamadasFragment()

        btnConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
//                .replace(R.id.fragment_conteudo, ConversasFragment())
                .replace(R.id.fragment_conteudo, conversasFragment)
                .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
//                .replace(R.id.fragment_conteudo, ChamadasFragment())
                .replace(R.id.fragment_conteudo, chamadasFragment)
//                .remove(conversasFragment)
                .commit()
        }

        //.remove remove a instância do fragment designado
        btnRemoverFragment.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .remove(conversasFragment)
                .remove(chamadasFragment)
                .commit()
        }
    }
}