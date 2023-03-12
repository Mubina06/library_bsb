package com.example.librarybsb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.librarybsb.EnumClass.Category
import com.example.librarybsb.R
import com.example.librarybsb.databinding.ActivityAboutBookBinding
import com.example.librarybsb.databinding.ActivityLibraryBinding

class AboutBook : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityAboutBookBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val book = intent.getParcelableExtra<Category>("book")
        if (book != null) {
            val imageView: ImageView = findViewById(R.id.ABimg)
            val textView: TextView = findViewById(R.id.ABtv)

            textView.text = book.nom
            imageView.setImageResource(book.photo)

        }


    }
}