package com.ethanmurray.fiveliveweldings

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
