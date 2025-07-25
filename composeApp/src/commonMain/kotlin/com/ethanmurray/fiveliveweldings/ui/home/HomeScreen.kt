package com.ethanmurray.fiveliveweldings.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    HomeScreenContent()
}

@Composable
fun HomeScreenContent() = Column {
    Text("Home")
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreenContent()
}
