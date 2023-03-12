package com.example.librarybsb

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.librarybsb.EnumClass.Category
import com.example.librarybsb.databinding.ActivityAboutBookBinding
import com.example.librarybsb.databinding.ActivityBuyBinding

class Buy : AppCompatActivity() {
    private lateinit var binding: ActivityBuyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityBuyBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




    }
}