package com.example.librarybsb.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.librarybsb.EnumClass.AddEnum
import com.example.librarybsb.R
import com.example.librarybsb.Read

class Books(var item_list: Array<AddEnum>) :RecyclerView.Adapter<Books.MyHolder>(){

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.bname)
        var img = itemView.findViewById<ImageView>(R.id.bimg)
        var price = itemView.findViewById<TextView>(R.id.bprice)
        var author = itemView.findViewById<TextView>(R.id.bauthor)
        var read = itemView.findViewById<Button>(R.id.add)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_books, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val index= item_list[position]
        holder.name.text = index.name
        holder.img.setImageResource(index.photo)
        holder.price.text = index.price

    }


    override fun getItemCount(): Int {
        return item_list.size
    }
}