package com.example.librarybsb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.librarybsb.Adapter.Adapter
import com.example.librarybsb.EnumClass.Category
import com.example.librarybsb.databinding.ActivityLibraryBinding

class Library : AppCompatActivity() {
    private lateinit var binding: ActivityLibraryBinding
    private lateinit var list: ArrayList<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityLibraryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)

        list = ArrayList()
        list.add(Category("Barkamol farzand tarbiyasi", R.drawable.book2, "35.000 sum"))
        list.add(Category("Tungi suhbatlar", R.drawable.book2, "40.000 sum"))
        list.add(Category("Men Robiya", R.drawable.book3, "42.000 sum"))
        list.add(Category("Mukammal kun", R.drawable.book4, "30.000 sum"))
        list.add(Category("Muso", R.drawable.book5, "27.000 sum"))
        list.add(Category("Bolalar", R.drawable.book6, "20.000 sum"))
        list.add(Category("Diqqat", R.drawable.book7, "47.000 sum"))
        list.add(Category("Madina mudofasi", R.drawable.book8, "19.000 sum"))
        list.add(Category("Islom moliyasi", R.drawable.book9, "32.000 sum"))
        list.add(Category("Ummat qizi", R.drawable.book10, "24.000 sum"))
        list.add(Category("JINOYAT JAZO", R.drawable.book11, "54.000 sum"))
        list.add(Category("IYMON", R.drawable.book12, "21.000 sum"))
        list.add(Category("Sir", R.drawable.book13, "49.000 sum"))
        list.add(Category("Oila", R.drawable.book14, "22.000 sum"))
        list.add(Category("Hojar", R.drawable.book15, "27.000 sum"))


        val adapter=Adapter(list)
        binding.rv.adapter = adapter


        adapter.onItemClick = {
            val intent = Intent(this, AboutBook::class.java)
            intent.putExtra("book", it)
            startActivity(intent)
        }


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