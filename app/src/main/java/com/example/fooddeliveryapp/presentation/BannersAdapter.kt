package com.example.fooddeliveryapp.presentation

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliveryapp.databinding.BannerItemBinding


class BannersAdapter(
    private val banners: List<Bitmap?>
) : RecyclerView.Adapter<BannersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannersViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = BannerItemBinding.inflate(layoutInflater, parent, false)
        return BannersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BannersViewHolder, position: Int) {
        holder.bind(banners[position])
    }

    override fun getItemCount(): Int {
        return banners.size
    }
}