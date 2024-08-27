package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook("Гиперион", "Дэн Симмонс")
    val book2 = RegularBook("Гиперион", "Дэн Симмонс")
    println(book1 == book2)
    // возвращается false, потому что сравниваются ссылки на объекты в памяти
    // (два разных объекта)

    val book11 = DataBook("Гиперион", "Дэн Симмонс")
    val book22 = DataBook("Гиперион", "Дэн Симмонс")
    println(book11 == book22)
    // возвращается true, потому что в data class сравниваются проинициализированные данные
    // (в данном случае - одинаковые данные в разных объектах)
}
