package org.example.lesson_16


class Order(
    private val numberOfOrder: Int,
    private var readinessStatus: String,
) {

    private fun changeStatus(status: String) {
        readinessStatus = status
    }

    fun applyFor(status: String) {
        changeStatus(status)
    }

    // для теста
    fun getReadinessStatus() = readinessStatus
}


fun main() {

    val order1 = Order(1, "в сборе")
    println(order1.getReadinessStatus())

    val newStatusOfOrder1 = order1.applyFor("готов")
    println(order1.getReadinessStatus())
}


