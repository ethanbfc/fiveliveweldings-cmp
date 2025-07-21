package com.ethanmurray.fiveliveweldings.ui.resources

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val colorScheme = lightColorScheme(
    primary = ColorPalette.Red,
    background = ColorPalette.Grey
)

@Composable
fun RootTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography, // TODO: Add app typography
        content = content
    )
}
