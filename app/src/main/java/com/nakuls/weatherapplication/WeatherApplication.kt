package com.nakuls.weatherapplication

import android.app.Application
import com.nakuls.weatherapplication.data.remote.RetrofitInstance
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WeatherApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WeatherApplication)
            modules(RetrofitInstance)
        }
    }
}