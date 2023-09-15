package com.jaws.mybinarchallengeapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.jaws.mybinarchallengeapp.R
import com.jaws.mybinarchallengeapp.model.Category

class RecyclerViewAdapterCategory(
    val categoryList: List<Category>
) : RecyclerView.Adapter<RecyclerViewAdapterCategory.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCatName = itemView.findViewById<TextView>(R.id.tv_category_name)
        val ivCatImg = itemView.findViewById<ShapeableImageView>(R.id.iv_category_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvCatName.setText(categoryList[position].catName)
        holder.ivCatImg.setImageResource(categoryList[position].catImgSrc)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}