package com.example.androiddemo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddemo.R
import com.example.androiddemo.activity.MainActivity

class MyBaseAdapter(private val datas: List<String>,
                    private val onClickListener: OnItemClickListener
) : RecyclerView.Adapter<MyBaseAdapter.ViewHolder>() {
    interface OnItemClickListener {
        fun onItemClick(position: Int, item: String)
    }

    override fun getItemCount(): Int {
        return  datas.size
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.base_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = datas[position]
        holder.title.text = item
        holder.bind(position, item, onClickListener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title)

        fun bind(position: Int, item: String, clickListener: OnItemClickListener) {
            itemView.setOnClickListener{
                clickListener.onItemClick(position, item)
            }
        }
    }


}

