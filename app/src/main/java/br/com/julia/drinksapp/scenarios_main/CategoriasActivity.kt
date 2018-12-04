package br.com.julia.drinksapp.scenarios_main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.julia.drinksapp.R
import br.com.julia.drinksapp.lista_drinks.ListaDrinksActivity
import kotlinx.android.synthetic.main.activity_categorias.*

class CategoriasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)

        btnBack.setOnClickListener(){
            val voltar = Intent(this, MainActivity::class.java)
            startActivity(voltar)
        }

        btnGin.setOnClickListener() {
            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 1)

            val intent = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(intent)
        }

        btnVodka.setOnClickListener() {
            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 2)

            val intent = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(intent)
        }

        btnCocktail.setOnClickListener() {
            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 3)

            val intent = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(intent)
        }

        btnOrdinary.setOnClickListener() {
            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 4)

            val intent = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(intent)
        }

        btnAlcoholic.setOnClickListener() {
            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 5)

            val intent = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(intent)
        }

        btnNonAlcoholic.setOnClickListener() {
            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 6)

            val intent = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(intent)
        }
    }
}
