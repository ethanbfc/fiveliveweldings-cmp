package com.ethanmurray.fiveliveweldings.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ethanmurray.fiveliveweldings.ui.components.PreviewSurface
import com.ethanmurray.fiveliveweldings.ui.resources.ColorPalette
import fiveliveweldings.composeapp.generated.resources.Res
import fiveliveweldings.composeapp.generated.resources.img_logo
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen() {
    SplashScreenContent()
}

@Composable
fun SplashScreenContent() = Column(
    modifier = Modifier
        .fillMaxSize()
        .background(color = ColorPalette.Grey)
        .statusBarsPadding()
        .navigationBarsPadding(),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Spacer(modifier = Modifier.weight(1f))
    Image(
        modifier = Modifier.size(128.dp),
        painter = painterResource(Res.drawable.img_logo),
        contentDescription = null
    )
    Spacer(modifier = Modifier.height(24.dp))
    CircularProgressIndicator(
        modifier = Modifier.size(16.dp),
        strokeWidth = 2.dp,
        color = ColorPalette.White
    )
    Spacer(modifier = Modifier.weight(1f))
}

@Preview
@Composable
fun SplashScreenPreview() = PreviewSurface {
    SplashScreenContent()
}
