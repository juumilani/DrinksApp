
package br.com.julia.drinksapp.utils

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import br.com.julia.drinksapp.R
import br.com.julia.drinksapp.scenarios_main.MainActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlideApp.with(this)
            .load("http://www.pngmart.com/files/7/Ice-Drink-Transparent-PNG.png")
            .into(imgLogoApp)

        Handler().postDelayed({
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
            finish()
        }, 2000)
    }
}
