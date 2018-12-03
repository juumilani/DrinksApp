package br.com.julia.drinksapp.scenarios_main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.julia.drinksapp.R
import kotlinx.android.synthetic.main.activity_categorias.*

class Categorias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)

        btnBack.setOnClickListener(){
            val voltar = Intent(this, MainActivity::class.java)
            startActivity(voltar)
        }
    }
}
