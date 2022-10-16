package com.example.fooddeliveryapp.presentation
import android.graphics.Bitmap
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliveryapp.databinding.BannerItemBinding

class BannersViewHolder(private val binding: BannerItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(banner: Bitmap?) {
        binding.bannerImageView.setImageBitmap(banner)
    }
}