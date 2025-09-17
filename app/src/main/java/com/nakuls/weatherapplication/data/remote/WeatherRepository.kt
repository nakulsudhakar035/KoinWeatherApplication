package com.nakuls.weatherapplication.data.remote

import com.nakuls.weatherapplication.data.model.Weather
import retrofit2.Response

interface WeatherRepository {
    suspend fun getWeather(
        apiKey: String, city: String
    ): Response<Weather>
}