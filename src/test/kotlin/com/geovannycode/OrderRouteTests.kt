package com.geovannycode

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.*

class OrderRouteTests {
    @Test
    fun testGetOrder() = testApplication {
        val response = client.get("/order/2023-03-12-01")
        assertEquals(
            """{"number":"2023-03-12-01","contents":[{"item":"Sandwich","amount":2,"price":10.0},{"item":"Beer","amount":3,"price":5.5},{"item":"Cheesecake","amount":1,"price":7.2},{"item":"Water","amount":2,"price":10.0}]}""",
            response.bodyAsText(),
        )
        assertEquals(HttpStatusCode.OK, response.status)
    }
}
