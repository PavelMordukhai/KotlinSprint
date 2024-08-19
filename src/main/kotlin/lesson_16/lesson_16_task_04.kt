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
}
