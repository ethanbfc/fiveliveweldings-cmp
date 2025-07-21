package com.ethanmurray.fiveliveweldings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ethanmurray.fiveliveweldings.ui.RootScreen
import com.ethanmurray.fiveliveweldings.ui.resources.RootTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            RootTheme {
                RootScreen()
            }
        }
    }
}
