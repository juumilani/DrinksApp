package br.com.julia.drinksapp.scenarios_main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.julia.drinksapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCategorias.setOnClickListener(){
            val exibirCategorias = Intent(this, Categorias::class.java)
            startActivity(exibirCategorias)
        }
    }

}
