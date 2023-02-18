package com.example.recyclerviewfirst

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OurAdapter(val songs:MutableList<Song>): RecyclerView.Adapter<OurAdapter.OurViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OurViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return OurViewHolder(view)
    }

    override fun onBindViewHolder(holder: OurViewHolder, position: Int) {
        holder.txtTitle?.text = songs[position].title
        holder.txtDesc?.text = songs[position].desc
        var color = "#29B31E"
        if(position%2==0){
            color = "#3B1EB3"
        }
        holder.colour?.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class OurViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txtTitle: TextView? =  itemView.findViewById<TextView>(R.id.songName)
        var txtDesc: TextView? =  itemView.findViewById<TextView>(R.id.desc)
        var colour: TextView? = itemView.findViewById<TextView>(R.id.containerId)

    }
}

