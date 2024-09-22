package com.arekalov.kmpfirst

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
