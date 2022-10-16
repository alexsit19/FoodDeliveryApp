package com.example.fooddeliveryapp.data

import com.example.fooddeliveryapp.domain.Repository
import java.io.File

class DefaultRepository : Repository {

    override fun fetchBanners(path: String) {
        val dir = File("banner_b1.png")
        val list = dir.listFiles()
        println("======== $list")
    }
}