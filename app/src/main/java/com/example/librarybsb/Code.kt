package com.example.librarybsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.example.librarybsb.databinding.ActivityCodeBinding

class Code : AppCompatActivity() {
    private lateinit var binding: ActivityCodeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {
            if (binding.Code.isNotEmpty()) {
                val intent = Intent(this, Library::class.java)
                startActivity(intent)
            }
            else {
                val toast = Toast.makeText(applicationContext, "Code?", Toast.LENGTH_LONG).show()
            }
        }
    }
}