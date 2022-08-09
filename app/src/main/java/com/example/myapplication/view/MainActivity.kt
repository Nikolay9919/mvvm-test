package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.viewModel.CityViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: CityViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        this.viewModel.getCityData().observe(this) {
            this.binding.cityImageView.setImageDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    it.imageDrawable,
                    application.theme
                )
            )
            this.binding.cityNameTextView.text = it.name
            this.binding.cityPopulationTextView.text = "${it.population}"
        }
    }
}