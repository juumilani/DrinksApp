package br.com.julia.drinksapp.lista_drinks

import br.com.julia.drinksapp.entities.Drink

interface ListaContract {

    interface View {

        fun showMessage(msg: String)

        fun showList(drinks: List<Drink>)

    }

    interface Presenter {

        fun onLoadList()        //Load random
    }
}