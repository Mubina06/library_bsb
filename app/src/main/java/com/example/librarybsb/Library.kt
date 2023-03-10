package com.example.librarybsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.librarybsb.Adapter.Adapter
import com.example.librarybsb.EnumClass.Category
import com.example.librarybsb.databinding.ActivityLibraryBinding

class Library : AppCompatActivity() {
    private lateinit var binding: ActivityLibraryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityLibraryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter=Adapter(Category.values())
        binding.rv.adapter = adapter

        binding.crime.setOnClickListener{
            var intent1 = Intent(this, Crime::class.java)
            startActivity(intent1)
        }
        binding.comedy.setOnClickListener{
            var intent2 = Intent(this, Comedy::class.java)
            startActivity(intent2)
        }
        binding.mystery.setOnClickListener{
            var intent3 = Intent(this, Mystery::class.java)
            startActivity(intent3)
        }
        binding.adventure.setOnClickListener{
            var intent4 = Intent(this, Adventure::class.java)
            startActivity(intent4)
        }
        binding.fantasy.setOnClickListener{
            var intent5 = Intent(this, Fantasy::class.java)
            startActivity(intent5)
        }
    }
}