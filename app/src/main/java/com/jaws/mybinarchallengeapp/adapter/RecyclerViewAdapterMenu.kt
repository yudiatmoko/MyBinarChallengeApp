package com.jaws.mybinarchallengeapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.jaws.mybinarchallengeapp.R
import com.jaws.mybinarchallengeapp.model.Menu

class RecyclerViewAdapterMenu(
    val menuList: List<Menu>
) : RecyclerView.Adapter<RecyclerViewAdapterMenu.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMenuName = itemView.findViewById<TextView>(R.id.tv_menu_name)
        val tvMenuPrice = itemView.findViewById<TextView>(R.id.tv_menu_price)
        val ivMenuImg = itemView.findViewById<ShapeableImageView>(R.id.iv_menu_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvMenuName.setText(menuList[position].menuName)
        holder.tvMenuPrice.setText(menuList[position].menuPrice)
        holder.ivMenuImg.setImageResource(menuList[position].menuImg)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}