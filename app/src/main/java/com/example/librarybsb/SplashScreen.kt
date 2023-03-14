package com.example.librarybsb

import android.R
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.librarybsb.databinding.ActivitySplashScreenBinding
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*
import kotlin.collections.ArrayList
import kotlin.system.exitProcess

class SplashScreen : AppCompatActivity() {
    private lateinit var getPreferences: SharedPreferences
    private lateinit var edit: SharedPreferences.Editor
    private lateinit var binding: ActivitySplashScreenBinding
    private var list = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener{
            if (binding.nameEt.text != null || binding.CardEt.text != null || binding.surnameEt.text != null || binding.PhoneEt.text != null) {
                val intent = Intent(this, Code::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Register?", Toast.LENGTH_LONG).show()
            }

            var intent = Intent(this, Code::class.java)
            startActivity(intent)
        }



        getPreferences = getSharedPreferences("lang", MODE_PRIVATE)
        edit = getPreferences.edit()

        val lang1 = getPreferences.getString("lang", "En")

        list.add("En")
        list.add("Rus")
        list.add("Uz")


        val adapter = ArrayAdapter(this, R.layout.simple_spinner_item, list)
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        binding.textView.text =
            resources.getString(com.example.librarybsb.R.string.reg)
        binding.nameEt.hint =
            resources.getString(com.example.librarybsb.R.string.name_)
        binding.surnameEt.hint =
            resources.getString(com.example.librarybsb.R.string.surname_)
        binding.PhoneEt.hint = resources.getString(com.example.librarybsb.R.string.number_)
        binding.CardEt.hint = resources.getString(com.example.librarybsb.R.string.card_)
        binding.next.text = resources.getString(com.example.librarybsb.R.string.next_)


        binding.spinner.adapter = adapter
        if (lang1 == "En") {
            binding.spinner.setSelection(0)
        }
        if (lang1 == "Ru") {
            binding.spinner.setSelection(1)
        }
        if (lang1 == "Uz") {
            binding.spinner.setSelection(2)
        }

        binding.spinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                p1: View?,
                position: Int,
                p3: Long
            ) {
                val lang = parent!!.getItemAtPosition(position).toString()
                var languageToLoad: String? = null

                when (lang) {
                    "En" -> {
                        languageToLoad = "en"
                        edit.putString("lang", "En").apply()
                    }
                    "Ru" -> {
                        languageToLoad = "ru"
                        edit.putString("lang", "Ru").apply()
                    }
                    "Uz" -> {
                        languageToLoad = "uz"
                        edit.putString("lang", "Uz").apply()

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
                binding.textView.text =
                    resources.getString(com.example.librarybsb.R.string.reg)
                binding.nameEt.hint =
                    resources.getString(com.example.librarybsb.R.string.name_)
                binding.surnameEt.hint =
                    resources.getString(com.example.librarybsb.R.string.surname_)
                binding.PhoneEt.hint = resources.getString(com.example.librarybsb.R.string.number_)
                binding.CardEt.hint =
                    resources.getString(com.example.librarybsb.R.string.card_)
                binding.next.text = resources.getString(com.example.librarybsb.R.string.next_)

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        })
    }
}
