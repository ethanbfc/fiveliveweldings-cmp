package com.ethanmurray.fiveliveweldings.ui.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.ethanmurray.fiveliveweldings.ui.resources.RootTheme

@Composable
fun PreviewSurface(
    color: Color = Color.Gray,
    content: @Composable () -> Unit
) = RootTheme {
    Surface(color = color, content = content)
}
