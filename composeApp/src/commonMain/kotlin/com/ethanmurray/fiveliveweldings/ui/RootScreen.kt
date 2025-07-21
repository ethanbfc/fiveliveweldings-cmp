package com.ethanmurray.fiveliveweldings.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ethanmurray.fiveliveweldings.ui.home.HomeScreen
import com.ethanmurray.fiveliveweldings.ui.splash.SplashScreen

enum class Screens {
    Splash,
    Home;
}

@Composable
fun RootScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Home.name
    ) {
        createScreenDefinitions()
    }

    navController.navigate(Screens.Splash.name)
}

private fun NavGraphBuilder.createScreenDefinitions() {
    composable(
        route = Screens.Splash.name,
        content = { SplashScreen() }
    )
    composable(
        route = Screens.Home.name,
        content = { HomeScreen() }
    )
}
