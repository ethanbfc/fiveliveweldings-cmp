package com.ethanmurray.fiveliveweldings.ui.components.effects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner

@Composable
fun ExecuteOnCreateEffect(
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    effect: () -> Unit
) = DisposableEffect(key1 = lifecycleOwner) {
    val lifecycle = lifecycleOwner.lifecycle
    val observer = LifecycleEventObserver { owner, event ->
        if (event == Lifecycle.Event.ON_CREATE) {
            effect()
        }
    }

    lifecycle.addObserver(observer)
    onDispose { lifecycle.removeObserver(observer) }
}

@Composable
fun ExecuteOnResumeEffect(
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    effect: () -> Unit
) = DisposableEffect(key1 = lifecycleOwner) {
    val lifecycle = lifecycleOwner.lifecycle
    val observer = LifecycleEventObserver { owner, event ->
        if (event == Lifecycle.Event.ON_RESUME) {
            effect()
        }
    }

    lifecycle.addObserver(observer)
    onDispose { lifecycle.removeObserver(observer) }
}
