package br.com.julia.drinksapp.scenarios_main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import br.com.julia.drinksapp.R
import br.com.julia.drinksapp.entities.Drink
import kotlinx.android.synthetic.main.activity_lista_drinks.*

class ListaDrinks : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_drinks)

        val drink = Drink(
            name = "Martini",
            id = "123",
            imageUrl = "https://www.titosvodka.com/uploads/recipes/_auto1000/martini-copper-pick.jpg"
        )

        val listaTeste = listOf(drink)

        exibeLista(listaTeste)
    }

    fun exibeLista(list: List<Drink>) {

        val adapter = DrinkAdapter(this, list)
        adapter.setOnClickListener { position ->
            //TODO
        }

        rvDrinks.adapter = adapter
        rvDrinks.layoutManager = LinearLayoutManager(this)

        rvDrinks.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }
}
