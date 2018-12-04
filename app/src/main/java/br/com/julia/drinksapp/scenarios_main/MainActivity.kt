package br.com.julia.drinksapp.scenarios_main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.julia.drinksapp.R
import br.com.julia.drinksapp.detalhes_drink.DetalhesDrinkActivity
import br.com.julia.drinksapp.lista_drinks.ListaContract
import br.com.julia.drinksapp.lista_drinks.ListaDrinksActivity
import br.com.julia.drinksapp.lista_drinks.ListaPresenter
import br.com.julia.drinksapp.network.RetrofitInitializer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCategorias.setOnClickListener(){
            val exibirCategorias = Intent(this, CategoriasActivity::class.java)
            startActivity(exibirCategorias)
        }

        /*btnSurpresa.setOnClickListener(){

            val presenter : ListaContract.Presenter = ListaPresenter(ListaDrinksActivity(), this)
            presenter.onLoadRandom()

            val passagemDeDados = Bundle()
            passagemDeDados.putInt("drink", 7)

            val exibirCategorias = Intent(this, ListaDrinksActivity::class.java)
            intent.putExtras(passagemDeDados)
            startActivity(exibirCategorias)
        }*/
    }

}
