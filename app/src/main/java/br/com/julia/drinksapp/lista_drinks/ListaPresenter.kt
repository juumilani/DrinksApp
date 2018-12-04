package br.com.julia.drinksapp.lista_drinks

import android.content.Intent
import android.os.Bundle
import android.util.Log
import br.com.julia.drinksapp.detalhes_drink.DetalhesDrinkActivity
import br.com.julia.drinksapp.entities.Drink
import br.com.julia.drinksapp.entities.DrinkList
import br.com.julia.drinksapp.network.RetrofitInitializer
import br.com.julia.drinksapp.scenarios_main.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListaPresenter(val view: ListaDrinksActivity, val view2: MainActivity) : ListaContract.Presenter {

    override fun onLoadList(drink: Int) {

        val drinksService = RetrofitInitializer().createDrinksService()
        var call = drinksService.getDrinkGin()

        if(drink == 2){
            call = drinksService.getDrinkVodka()

        } else if (drink == 3){
            call = drinksService.getDrinkCocktail()

        } else if (drink == 4) {
            call = drinksService.getDrinkOrdinary()

        } else if(drink == 5){
            call = drinksService.getDrinkAlcoholic()

        } else if(drink == 6) {
            call = drinksService.getDrinkNonAlcoholic()
        }


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

//    override fun onLoadRandom(){
//
//        val drinksService = RetrofitInitializer().createDrinksService()
//        val call = drinksService.getRandomDrink()
//
////        val dados = Bundle()
////
////        dados.putSerializable("object")
////        mostraNaTela.putExtras(dados)
//
//        call.enqueue(object : Callback<DrinkList> {
//            override fun onFailure(call: Call<DrinkList>, t: Throwable) {
//                view.showMessage("Falha na conexão. Cheque o acesso à internet.")
//            }
//
//            override fun onResponse(call: Call<DrinkList>, response: Response<DrinkList>) {
//                if(response.body() != null) {
//                    Log.d("TESTANDO", "ENTREI CERTO")
//                    Log.d("TESTANDO", response.body()!!.copy().toString())
//                    view.showDrink(response.body()!!.drinks)
//                } else {
//                    Log.d("TESTANDO", "ENTREI NULL")
//                    view.showMessage("Não há drinks para exibir.")
//                }
//            }
//        })
//    }

}