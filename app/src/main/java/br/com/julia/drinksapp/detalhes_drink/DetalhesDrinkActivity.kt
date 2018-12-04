package br.com.julia.drinksapp.detalhes_drink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.julia.drinksapp.R
import android.content.Intent
import br.com.julia.drinksapp.entities.Drink
import br.com.julia.drinksapp.utils.GlideApp
import kotlinx.android.synthetic.main.activity_detalhes_drink.*

class DetalhesDrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_drink)

        val recebeIntent = intent
        val parametros = recebeIntent.extras

        val drink : Drink

        if (parametros != null) {

            drink = parametros.getSerializable("object") as Drink

            nomeDrink.setText(drink.strDrink)

            infoIntrucoes.setText(drink.strInstructions)

            val ingredientes = mutableListOf(drink.strIngredient1, drink.strIngredient2,
                drink.strIngredient3,drink.strIngredient4,drink.strIngredient5,drink.strIngredient6,
                drink.strIngredient7,drink.strIngredient8,drink.strIngredient9,drink.strIngredient10,
                drink.strIngredient11,drink.strIngredient12,drink.strIngredient13,drink.strIngredient14,
                drink.strIngredient15)

            val medidas = mutableListOf(drink.strMeasure1, drink.strMeasure2,
                drink.strMeasure3,drink.strMeasure4,drink.strMeasure5,drink.strMeasure6,
                drink.strMeasure7,drink.strMeasure8,drink.strMeasure9,drink.strMeasure10,
                drink.strMeasure11,drink.strMeasure12,drink.strMeasure13,drink.strMeasure14,
                drink.strMeasure15)

            val ingredientsIterator = ingredientes.iterator()
            val stringIngredient = java.lang.StringBuilder()

            for(item in ingredientsIterator){
                if(!item.isNullOrBlank()){
                    stringIngredient.append(item).append('\n').append('\n')
                }
            }

            val quantityIterator = medidas.listIterator()
            val stringQuantity = StringBuilder()

            for(item in quantityIterator){
                if(!item.isNullOrBlank()){
                    stringQuantity.append(item).append('\n').append('\n')
                }
            }

            test.text = stringIngredient
            test2.text = stringQuantity

            GlideApp.with(this)
                .load(drink.strDrinkThumb)
                .centerCrop()
                .into(imgFoto)
        }
    }
}
