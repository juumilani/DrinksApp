package br.com.julia.drinksapp.lista_drinks

import br.com.julia.drinksapp.entities.DrinkList
import br.com.julia.drinksapp.lista_drinks.ListaContract
import br.com.julia.drinksapp.network.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListaPresenter(val view : ListaContract.View) : ListaContract.Presenter {

    override fun onLoadList() {

        val drinksService = RetrofitInitializer().createDrinksService()

        val call = drinksService.getRandomDrink()

        call.enqueue(object : Callback<DrinkList> {
            override fun onFailure(call: Call<DrinkList>, t: Throwable) {
                view.showMessage("Falha na conexão. Cheque o acesso à internet.")
            }

            override fun onResponse(call: Call<DrinkList>, response: Response<DrinkList>) {
                if(response.body() != null) {
                    view.showList(response.body()!!.drinks)
                } else {
                    view.showMessage("Não há drinks para exibir.")
                }
            }
        })
    }

}