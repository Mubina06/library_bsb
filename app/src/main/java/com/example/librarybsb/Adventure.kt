package com.example.librarybsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.example.librarybsb.Adapter.Books
import com.example.librarybsb.Add.Book1
import com.example.librarybsb.EnumClass.AddEnum
import com.example.librarybsb.databinding.ActivityAdventureBinding

class Adventure : AppCompatActivity() {
    private lateinit var binding: ActivityAdventureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityAdventureBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val adapter= Books(AddEnum.values())
        binding.adrv.adapter = adapter




    }
}