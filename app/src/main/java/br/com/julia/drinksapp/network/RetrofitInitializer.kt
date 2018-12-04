package br.com.julia.drinksapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://www.thecocktaildb.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun createDrinksService() = retrofit.create(DrinksService::class.java)

}