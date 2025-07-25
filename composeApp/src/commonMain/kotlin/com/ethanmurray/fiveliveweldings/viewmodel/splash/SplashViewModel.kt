package com.ethanmurray.fiveliveweldings.viewmodel.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

open class SplashViewModel(): ViewModel() {
    val state = MutableStateFlow<State>(State.Fetching)

    fun fetch() = viewModelScope.launch {
        state.value = State.Fetching
        delay(1000L)
        state.value = State.Success
    }

    sealed class State {
        object Fetching: State()
        object Success: State()
    }
}
