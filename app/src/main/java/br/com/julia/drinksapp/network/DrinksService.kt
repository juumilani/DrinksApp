package br.com.julia.drinksapp.network

import br.com.julia.drinksapp.entities.Drink
import br.com.julia.drinksapp.entities.DrinkList
import retrofit2.Call
import retrofit2.http.GET

interface DrinksService {

    @GET("json/v1/1/filter.php?i=Gin")
    fun getDrinkGin(): Call<DrinkList>

    @GET("json/v1/1/filter.php?i=Vodka")
    fun getDrinkVodka(): Call<DrinkList>

    @GET("json/v1/1/filter.php?c=Cocktail")
    fun getDrinkCocktail(): Call<DrinkList>

    @GET("json/v1/1/filter.php?c=Ordinary_Drink")
    fun getDrinkOrdinary(): Call<DrinkList>

    @GET("json/v1/1/filter.php?a=Alcoholic")
    fun getDrinkAlcoholic(): Call<DrinkList>

    @GET("json/v1/1/filter.php?a=Non_Alcoholic")
    fun getDrinkNonAlcoholic() : Call<DrinkList>

    @GET("json/v1/1/random.php")
    fun getRandomDrink(): Call<DrinkList>           // não funciona

}