package org.example.lesson_15


interface ProductSearch {
    fun searchProduct()
}


abstract class Product(
    val name: String,
    val number: Int,
)


class MusicalInstrumentComponent(
    name: String,
    number: Int,
) : Product(name, number)


class MusicalInstrument(
    name: String,
    number: Int,
) : Product(name, number), ProductSearch {

    override fun searchProduct() {
        println("Выполняется поиск")
    }
}


fun main() {

    val instrument1 = MusicalInstrument("скрипка", 8)
    instrument1.searchProduct()
}
