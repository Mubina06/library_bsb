package com.example.librarybsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.librarybsb.Adapter.Books
import com.example.librarybsb.EnumClass.AddEnum
import com.example.librarybsb.databinding.ActivityMysteryBinding

class Mystery : AppCompatActivity() {
    private lateinit var binding: ActivityMysteryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMysteryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter= Books(AddEnum.values())
        binding.myrv.adapter = adapter
    }
}