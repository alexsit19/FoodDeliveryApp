package com.example.fooddeliveryapp.presentation

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginEnd
import com.example.fooddeliveryapp.databinding.ActivityMainBinding
import com.example.fooddeliveryapp.databinding.ActivityMainBinding.inflate
import java.io.IOException


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    val binding: ActivityMainBinding get() = requireNotNull(_binding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = inflate(layoutInflater)
        setContentView(binding.root)
        val banner1: Bitmap? = getBitmapFromAsset("banner_b1.png")
        val banner2: Bitmap? = getBitmapFromAsset("banner_b2.png")
        val banner3: Bitmap? = getBitmapFromAsset("banner_b3.png")
        val banner4: Bitmap? = getBitmapFromAsset("banner_b4.png")
        val banner5: Bitmap? = getBitmapFromAsset("banner_b5.png")
        val banners: List<Bitmap?> = listOf(banner1, banner2, banner3, banner4, banner5)
        val bannersAdapter = BannersAdapter(banners)

        binding.banners.adapter = bannersAdapter





    }

    @Throws(IOException::class)
    private fun getBitmapFromAsset(strName: String): Bitmap? {
        val assetManager = assets
        val istr = assetManager.open(strName)
        return BitmapFactory.decodeStream(istr)
    }
}