package com.ethanmurray.fiveliveweldings.ui.components.Effects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filterIsInstance

@Composable
inline fun <FlowType, reified FilterType: FlowType> ExecuteOnInstanceEffect(
    flow: Flow<FlowType>,
    crossinline callback: (value: FilterType) -> Unit
) = LaunchedEffect(key1 = Unit) {
    flow.filterIsInstance<FilterType>().collect {
        callback(it)
    }
}
