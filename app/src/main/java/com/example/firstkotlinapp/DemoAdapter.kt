package com.example.firstkotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DemoAdapter(val dataList: ArrayList<String>) : RecyclerView.Adapter<DemoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = dataList.size


    override fun onBindViewHolder(holder: DemoAdapter.ViewHolder, position: Int) {
        holder.row_text.text = dataList[position]
    }

    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val row_text: TextView = itemview.findViewById(R.id.row_text)
    }

}