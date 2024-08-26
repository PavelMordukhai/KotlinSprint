package org.example.lesson_22

class RegularBook1(
    val title: String,
    val author: String,
)

data class DataBook1(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook1("Гиперион", "Дэн Симмонс")
    println(book1) // выводит: org.example.lesson_22.RegularBook@34c45dca
    // Возвращается строковое представление объекта по умолчанию -
    // расположение и название класса и его хэш-код.

    val book11 = DataBook1("Гиперион", "Дэн Симмонс")
    println(book11) // выводит: DataBook(title=Гиперион, author=Дэн Симмонс)
    // Возвращается переопределённое строковое представление объекта -
    // название класса и перечисление свойств объекта с присвоенными данными
}
