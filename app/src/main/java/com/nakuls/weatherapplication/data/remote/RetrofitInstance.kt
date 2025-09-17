package com.nakuls.weatherapplication.data.remote

import androidx.lifecycle.viewmodel.compose.viewModel
import com.nakuls.weatherapplication.data.remote.WeatherRepository
import com.nakuls.weatherapplication.domain.WeatherRepositoryImpl
import com.nakuls.weatherapplication.data.model.Weather
import com.nakuls.weatherapplication.viewModel.WeatherViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val baseurl = "https://api.weatherapi.com"
val RetrofitInstance = module {

    single{
        Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create<WeatherAPI>(WeatherAPI::class.java)
    }

    single<WeatherRepository> {
        WeatherRepositoryImpl(get())
    }

    viewModel {
        WeatherViewModel(get())
    }
}

