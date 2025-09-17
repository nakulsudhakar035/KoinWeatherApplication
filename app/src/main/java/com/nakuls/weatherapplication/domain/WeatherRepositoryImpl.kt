package com.nakuls.weatherapplication.domain

import com.nakuls.weatherapplication.data.model.Weather
import com.nakuls.weatherapplication.data.remote.WeatherAPI
import com.nakuls.weatherapplication.data.remote.WeatherRepository
import retrofit2.Response

class WeatherRepositoryImpl(
    private val weatherAPI: WeatherAPI
): WeatherRepository {

    override suspend fun getWeather(
        apiKey: String,
        city: String
    ): Response<Weather> {
        return weatherAPI.getWeather(apiKey,city)
    }
}