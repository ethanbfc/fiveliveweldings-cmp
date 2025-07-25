package com.ethanmurray.fiveliveweldings.engine.di

import com.ethanmurray.fiveliveweldings.viewmodel.splash.SplashViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

fun viewModelModule(): Module = module {
    viewModel { SplashViewModel() }
}
