package com.ethanmurray.fiveliveweldings.engine.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

object KoinFactory {
    fun start(initializer: KoinApplication.() -> Unit): KoinApplication = startKoin {
        initializer()
        modules(viewModelModule())
        modules(useCaseModule())
        modules(repositoryModule())
    }
}
