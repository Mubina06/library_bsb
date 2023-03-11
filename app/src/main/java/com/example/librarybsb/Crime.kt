package com.example.librarybsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.librarybsb.Adapter.Books
import com.example.librarybsb.EnumClass.AddEnum
import com.example.librarybsb.EnumClass.Category
import com.example.librarybsb.databinding.ActivityCrimeBinding

class Crime : AppCompatActivity() {
    private lateinit var binding: ActivityCrimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityCrimeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val adapter= Books(AddEnum.values())
        binding.crrv.adapter = adapter
    }
}