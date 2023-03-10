package com.example.librarybsb.EnumClass

import android.graphics.Color
import com.example.librarybsb.R

enum class Category ( var nom: String, var photo: Int, var price: String){
    BARKAMOL("Barkamol farzand tarbiyasi", R.drawable.book1, "35.000 sum"),
    TUNGI("Tungi suhbatlar", R.drawable.book2, "40.000 sum"),
    ROBIYA("Men Robiya", R.drawable.book3, "42.000 sum"),
    MUKAMMAL("Mukammal kun", R.drawable.book4, "30.000 sum"),
    MUSO("Muso", R.drawable.book5, "27.000 sum"),
    BOLALAR("Bolalar", R.drawable.book6, "20.000 sum"),
    DIQQAT("Diqqat", R.drawable.book7, "47.000 sum"),
    MADINA("Madina mudofasi", R.drawable.book8, "19.000 sum"),
    ISLOM("Islom moliyasi", R.drawable.book9, "32.000 sum"),
    UMMAT("Ummat qizi", R.drawable.book10, "24.000 sum"),
    JVJ("JINOYAT JAZO", R.drawable.book11, "54.000 sum"),
    IYMON("IYMON", R.drawable.book12, "21.000 sum"),
    SIR("Sir", R.drawable.book13, "49.000 sum"),
    OILA("Oila", R.drawable.book14, "22.000 sum"),
    AYOL("Hojar", R.drawable.book15, "27.000 sum")

}