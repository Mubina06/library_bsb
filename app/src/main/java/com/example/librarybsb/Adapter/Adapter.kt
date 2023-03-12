package com.example.librarybsb.Adapter

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.librarybsb.EnumClass.Category
import com.example.librarybsb.R

class Adapter(var item_list: ArrayList<Category>) :RecyclerView.Adapter<Adapter.MyHolder>(){

    var onItemClick : ((Category) -> Unit)? = null
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name = itemView.findViewById<TextView>(R.id.name)
        var img = itemView.findViewById<ImageView>(R.id.img)
        var price = itemView.findViewById<TextView>(R.id.price)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_popular, parent, false)
        return MyHolder(itemView)


    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val index= item_list[position]
        holder.name.text = index.nom
        holder.img.setImageResource(index.photo)
        holder.price.text = index.price

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(index)
        }
    }

    override fun getItemCount(): Int {
        return item_list.size
    }
}