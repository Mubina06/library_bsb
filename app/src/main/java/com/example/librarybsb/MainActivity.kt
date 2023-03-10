package com.example.librarybsb

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import com.example.librarybsb.databinding.ActivityCodeBinding
import com.example.librarybsb.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var getPreferences: SharedPreferences
    private lateinit var getPreferencesState: SharedPreferences
    private var state = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getPreferences = getSharedPreferences("lang", MODE_PRIVATE)
        getPreferencesState = getSharedPreferences("state", MODE_PRIVATE)
        state = getPreferencesState.getBoolean("State", false)
        val lang = getPreferences.getString("lang", "")

        var languageToLoad: String? = null

        when (lang) {
            "En" -> {
                languageToLoad = "en"
            }
            "Ru" -> {
                languageToLoad = "ru"
            }
            "Uz" -> {
                languageToLoad = "uz"
            }
        }

        if (languageToLoad != null) {
            val locale = Locale(languageToLoad)
            Locale.setDefault(locale)
            val config = Configuration()
            config.locale = locale
            baseContext.resources.updateConfiguration(
                config,
                baseContext.resources.displayMetrics
            )
        }

        supportActionBar?.hide()
        Handler().postDelayed({
            if (state) {
                val intent = Intent(this, Code::class.java)
                startActivity(intent)
            } else {
                val intent2 = Intent(this, SplashScreen::class.java)
                startActivity(intent2)
            }
        }, 3000)
    }
}