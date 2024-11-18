package com.webdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform