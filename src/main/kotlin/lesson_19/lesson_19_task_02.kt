package org.example.lesson_19

enum class CategoryOfProducts {
    CLOTHING,
    STATIONERY,
    MISC;

    fun getCategoryName() = when(this) {
        CLOTHING -> "одежда"
        STATIONERY -> "канцелярские товары"
        MISC -> "разное"
    }
}

class Product(
    private val id: Int,
    private val name: String,
    private val category: String,
) {
    fun printInfoAboutProduct() {
        var count = 0
        var categoryName = ""

        for (availableCategory in CategoryOfProducts.entries) {
            if (availableCategory.getCategoryName() == category) {
                categoryName = category
                break
            }
            count++
        }
        if (count == CategoryOfProducts.entries.size)
            println("Такой категории нет, товар не найден")
        else {
            println("ID товара - $id")
            println("Название товара - $name")
            println("Категория товара - $categoryName")
        }
    }
}

fun main() {
    val product1 = Product(1, "карандаш", "канцелярские товары")
    product1.printInfoAboutProduct()
    println()

    val product2 = Product(2, "рубашка", "одежда")
    product2.printInfoAboutProduct()
    println()

    val product3 = Product(3, "брелок", "разное")
    product3.printInfoAboutProduct()
    println()

    val product4 = Product(4, "аспирин", "медицина")
    product4.printInfoAboutProduct()
    println()
}
