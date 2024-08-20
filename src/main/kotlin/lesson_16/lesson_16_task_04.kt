package org.example.lesson_16


class Order(
    private val numberOfOrder: Int
) {
    private var readinessStatus: String = ""

    private fun changeStatus(status: String) {
        readinessStatus = status
    }

    fun applyFor(status: String) {
        changeStatus(status)
    }

    // для тестовых println
    fun getReadinessStatus() = readinessStatus
    fun getNumberOfOrder() = numberOfOrder
}


fun main() {

    val order1 = Order(1)

    var statusOfOrder1 = order1.applyFor("В сборе")
    println("Заказ №${order1.getNumberOfOrder()}: ${order1.getReadinessStatus()}")

    statusOfOrder1 = order1.applyFor("Готов")
    println("Заказ №${order1.getNumberOfOrder()}: ${order1.getReadinessStatus()}")
}
