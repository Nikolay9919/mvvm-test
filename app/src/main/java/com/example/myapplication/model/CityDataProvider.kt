package com.example.myapplication.model

import com.example.myapplication.R

class CityDataProvider {

    private val citiesList = arrayListOf<City>()


    init {
        citiesList.add(City("bangkok", R.drawable.bangkok, 10_000_000))
        citiesList.add(City("beijing", R.drawable.beijing, 21_000_500))
        citiesList.add(City("london", R.drawable.london, 8_900_000))
        citiesList.add(City("newyork", R.drawable.newyork, 8_400_000))
        citiesList.add(City("paris", R.drawable.paris, 2_100_000))
        citiesList.add(City("rio", R.drawable.rio, 6_700_000))
        citiesList.add(City("rome", R.drawable.rome, 2_800_000))
        citiesList.add(City("singapore", R.drawable.singapore, 5_700_000))
        citiesList.add(City("sydney", R.drawable.sydney, 5_300_000))
        citiesList.add(City("tokyo", R.drawable.tokyo, 13_900_000))
    }

    fun getListOfCities() = citiesList
}