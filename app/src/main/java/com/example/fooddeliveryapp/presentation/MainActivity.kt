package com.example.fooddeliveryapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.data.DefaultRepository
import com.example.fooddeliveryapp.databinding.ActivityMainBinding
import com.example.fooddeliveryapp.databinding.ActivityMainBinding.inflate
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = requireNotNull(_binding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment

        val navController = navHostFragment.navController
        val bottomNavigation = binding.bottomNavigation
        bottomNavigation.setupWithNavController(navController)
        val rep = DefaultRepository()

        lifecycleScope.launch {
            val list = rep.getMeals("beef")
            println(list)
        }
            //setupUi()
        }
    }

//    @Throws(IOException::class)
//    private fun getBitmapFromAsset(fileName: String): Bitmap? {
//        val assetManager = assets
//        val inputStream = assetManager.open(fileName)
//        return BitmapFactory.decodeStream(inputStream)
//    }
//
//    private fun setupUi() {
//        val banner1: Bitmap? = getBitmapFromAsset("banner_b1.png")
//        val banner2: Bitmap? = getBitmapFromAsset("banner_b2.png")
//        val banner3: Bitmap? = getBitmapFromAsset("banner_b3.png")
//        val banner4: Bitmap? = getBitmapFromAsset("banner_b4.png")
//        val banner5: Bitmap? = getBitmapFromAsset("banner_b5.png")
//        val banners: List<Bitmap?> = listOf(banner1, banner2, banner3, banner4, banner5)
//
//        val bannersAdapter = BannersAdapter(banners)
//
//        binding.banners.adapter = bannersAdapter
//        TabLayoutMediator(binding.tabLayout, binding.banners) { _, _ ->
//
//        }.attach()
//
//
//
//    }
