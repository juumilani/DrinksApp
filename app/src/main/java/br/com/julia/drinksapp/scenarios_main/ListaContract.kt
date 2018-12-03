package br.com.julia.drinksapp.scenarios_main

import br.com.julia.drinksapp.entities.Drink

interface ListaContract {

    interface View {
        fun showMessage(msg: String)

        fun showList(drinks: List<Drink>)

    }

    interface Presenter {

        fun onLoadList()
    }
}