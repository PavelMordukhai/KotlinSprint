package org.example.lesson_18

class Order {
    fun getOrderInfo(numberOfOrder: Int, product: String) {
        println("Заказ № $numberOfOrder.\nЗаказан товар: $product")
    }

    fun getOrderInfo(numberOfOrder: Int, products: List<String>) {
        println("Заказ № $numberOfOrder.\nЗаказаны следующие товары: ${products.joinToString()}")
    }
}

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.getOrderInfo(1, "pizza")
    println()
    order2.getOrderInfo(2, listOf("pizza", "coffee", "burger"))
}
