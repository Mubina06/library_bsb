package com.example.librarybsb

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.example.librarybsb.databinding.ActivityCodeBinding

class Code : AppCompatActivity() {
    private lateinit var binding: ActivityCodeBinding
    private lateinit var getPreferencesState: SharedPreferences
    private lateinit var editState: SharedPreferences.Editor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getPreferencesState = getSharedPreferences("state", MODE_PRIVATE)
        editState = getPreferencesState.edit()



        binding.button.setOnClickListener {
            if (binding.pincode.text != null) {
                val intent = Intent(this, Library::class.java)
                startActivity(intent)
                editState.putBoolean("State", true).apply()
            } else {
                Toast.makeText(this, "Code?", Toast.LENGTH_LONG).show()
            }
        }
    }
}