package com.geovannycode

import io.ktor.server.application.*
import com.geovannycode.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureSerialization()
    configureRouting()
}
