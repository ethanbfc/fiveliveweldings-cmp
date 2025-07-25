package com.ethanmurray.fiveliveweldings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ethanmurray.fiveliveweldings.engine.di.KoinFactory
import com.ethanmurray.fiveliveweldings.ui.RootScreen
import com.ethanmurray.fiveliveweldings.ui.resources.RootTheme
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        KoinFactory.start {
            androidLogger()
            androidContext(this@MainActivity)
        }

        setContent {
            RootTheme {
                RootScreen()
            }
        }
    }
}
