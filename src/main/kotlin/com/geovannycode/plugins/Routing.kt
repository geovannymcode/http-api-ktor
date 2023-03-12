package com.geovannycode.plugins

import com.geovannycode.routes.customerRouting
import com.geovannycode.routes.getOrderRoute
import com.geovannycode.routes.listOrderRoute
import com.geovannycode.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrderRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
