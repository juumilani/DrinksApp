package br.com.julia.drinksapp.network

import br.com.julia.drinksapp.entities.DrinkList
import retrofit2.Call
import retrofit2.http.GET

interface DrinksService {

    @GET("json/v1/1/filter.php?c=Ordinary_Drink")
    fun getDrinkOrdinary(): Call<DrinkList>

    @GET("json/v1/1/random.php")
    fun getRandomDrink(): Call<DrinkList>

}