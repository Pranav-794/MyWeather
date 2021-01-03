package com.example.myweather.data.network

import androidx.lifecycle.LiveData
import com.example.myweather.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
            location: String,
            languageCode: String
    )
}