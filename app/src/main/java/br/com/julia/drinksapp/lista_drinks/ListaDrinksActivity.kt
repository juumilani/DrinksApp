package br.com.julia.drinksapp.lista_drinks

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import br.com.julia.drinksapp.R
import br.com.julia.drinksapp.detalhes_drink.DetalhesDrinkActivity
import br.com.julia.drinksapp.entities.Drink
import br.com.julia.drinksapp.entities.DrinkAdapter
import br.com.julia.drinksapp.entities.DrinkList
import br.com.julia.drinksapp.scenarios_main.MainActivity
import kotlinx.android.synthetic.main.activity_lista_drinks.*

class ListaDrinksActivity : AppCompatActivity(), ListaContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_drinks)

        val recebeIntent = getIntent()
        val drink = recebeIntent.getIntExtra("drink", -1)

        val presenter : ListaContract.Presenter = ListaPresenter(this)
        presenter.onLoadList(drink)

    }

    override fun showList(drinks: List<Drink>) {

        val adapter = DrinkAdapter(this, drinks)
        adapter.setOnClickListener { position ->

            val dados = Bundle()

            dados.putSerializable("object", drinks.get(position))

            val mostraNaTela = Intent(this, DetalhesDrinkActivity::class.java)
            mostraNaTela.putExtras(dados)
            startActivity(mostraNaTela)
        }

        rvDrinks.adapter = adapter
        rvDrinks.layoutManager = LinearLayoutManager(this)

        rvDrinks.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }


    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

}
