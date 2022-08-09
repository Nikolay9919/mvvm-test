package com.example.myapplication.model

import androidx.annotation.DrawableRes

data class City(
    val name: String,
    @DrawableRes val imageDrawable: Int,
    val population: Int
)
