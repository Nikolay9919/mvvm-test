package com.example.myapplication.viewModel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.City
import com.example.myapplication.model.CityDataProvider

class CityViewModel : ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val listOfCities = CityDataProvider().getListOfCities()
    private var currentIndex = 0

    init {
        this.loop()
    }

    fun getCityData(): LiveData<City> = cityData

    private fun loop() {
        Handler(Looper.getMainLooper()).postDelayed({
            this.updateCity()
        }, delay)
    }

    private fun updateCity() {
        this.currentIndex++
        this.currentIndex %= listOfCities.size

        this.cityData.value = listOfCities[currentIndex]

        this.loop()
    }

    companion object {
        private const val delay = 2000L
    }
}