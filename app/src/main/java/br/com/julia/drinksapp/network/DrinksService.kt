package br.com.julia.drinksapp.network

import br.com.julia.drinksapp.entities.Drink
import br.com.julia.drinksapp.entities.DrinkList
import retrofit2.Call
import retrofit2.http.GET

interface DrinksService {

    @GET("1/filter.php?c=Ordinary_Drink")
    fun getDrinkOrdinary(): Call<DrinkList>

    @GET("1/random.php")
    fun getRandomDrink(): Call<Drink>

}