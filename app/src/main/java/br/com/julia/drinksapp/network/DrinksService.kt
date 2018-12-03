package br.com.julia.drinksapp.network

import br.com.julia.drinksapp.entities.DrinkList
import retrofit2.Call
import retrofit2.http.GET

interface DrinksService {

    @GET("1/list.php?c=list")
    fun getDrinkByCategory(): Call<DrinkList>
}