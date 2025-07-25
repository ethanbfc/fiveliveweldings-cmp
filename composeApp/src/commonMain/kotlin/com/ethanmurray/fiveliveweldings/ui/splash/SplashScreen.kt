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
import androidx.navigation.NavController
import com.ethanmurray.fiveliveweldings.ui.Screens
import com.ethanmurray.fiveliveweldings.ui.components.PreviewSurface
import com.ethanmurray.fiveliveweldings.ui.components.effects.ExecuteOnCreateEffect
import com.ethanmurray.fiveliveweldings.ui.components.effects.ExecuteOnInstanceEffect
import com.ethanmurray.fiveliveweldings.ui.resources.ColorPalette
import com.ethanmurray.fiveliveweldings.viewmodel.splash.SplashViewModel
import com.ethanmurray.fiveliveweldings.viewmodel.splash.SplashViewModel.State
import fiveliveweldings.composeapp.generated.resources.Res
import fiveliveweldings.composeapp.generated.resources.img_logo
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SplashScreen(
    navController: NavController
) {
    val viewModel = koinViewModel<SplashViewModel>()

    ExecuteOnCreateEffect {
        viewModel.fetch()
    }

    ExecuteOnInstanceEffect<State, State.Success>(viewModel.state) {
        navController.navigate(Screens.Home.name)
    }

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
