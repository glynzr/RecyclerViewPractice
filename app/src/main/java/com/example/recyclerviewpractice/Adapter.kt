package com.example.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class Adapter(private val dataList:ArrayList<Item>):RecyclerView.Adapter<Adapter.ViewHolder>(){
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
            val rvImage:ImageView=itemView.findViewById(R.id.icon)
            val rvtitle:TextView=itemView.findViewById(R.id.item_name)
            val rvDescription:TextView=itemView.findViewById(R.id.icon_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem=dataList[position]
        holder.rvDescription.text=currentItem.description
        holder.rvtitle.text=currentItem.title
        holder.rvImage.setImageResource(currentItem.image)

    }
}