package com.geovannycode.models

import kotlinx.serialization.Serializable

@Serializable
data class Order(val number: String, val contents: List<OrderItem>)

@Serializable
data class OrderItem(val item: String, val amount: Int, val price: Double)

val orderStorage = listOf(
    Order(
        "2023-03-12-01",
        listOf(
            OrderItem("Sandwich", 2, 10.0),
            OrderItem("Beer", 3, 5.5),
            OrderItem("Cheesecake", 1, 7.2),
            OrderItem("Water", 2, 10.0),
        ),
    ),
    Order(
        "2023-03-11-01",
        listOf(
            OrderItem("Water", 2, 8.50),
            OrderItem("Ice cream", 3, 2.5),
            OrderItem("Cheesecake", 1, 7.2),
            OrderItem("Sandwich", 2, 10.0),
        ),
    ),
)
