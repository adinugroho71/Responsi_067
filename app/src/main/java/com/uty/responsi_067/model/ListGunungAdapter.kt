package com.uty.responsi_067.model

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.responsi_067.R
import com.uty.responsi_067.model.ListGunungAdapter as ListGunungAdapter1

class ListGunungAdapter (private val listFood: ArrayList<gunung>) : RecyclerView.Adapter<ListGunungAdapter1.gunungViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gunungViewHolder {
        val view: LayoutInflater? = LayoutInflater.from(parent.context)
        return gunungViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: gunungViewHolder, position: Int) {
        val gunung = com.uty.responsi_067.model.ListGunungAdapter[position]
        holder.tvName.text = gunung.name
        holder.tvgunung.text = gunung.detail
        Glide.with(holder.itemView.context)
            .load(gunung.poster)
            .into(holder.imgPoster)

        holder.itemView.setOnClickListener(){
            Toast.makeText(
                holder.itemView.context,"Kamu pilih"+listFood[holder.adapterPosition].name, Toast.LENGTH_LONG
            ).show()
        }
    }

    inner class gunungViewHolder(itemView: LayoutInflater?) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView
        var tvgunung: TextView = itemView (R.id.tv_item_detail)
        var imgPoster: ImageView = itemView (R.id.img_item_poster)
    }
}