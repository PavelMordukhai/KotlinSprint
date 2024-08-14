package org.example.lesson_13

/*
Задача 2 к Уроку 13

Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.

Дополни класс методом, который будет печатать информацию о контакте
сообщением в одном println() и без использования многострочного ввода такого типа (пример):

- Имя: Ростислав
- Номер: 89123456789
- Компания: Reddit

Вместо null значения в консоль должна выводиться строка <не указано>.
 */


class PhoneBookContact2(
    val name: String,
    val phoneNumber: Long,
) {
    var company: String? = null

    constructor(
        name: String,
        phoneNumber: Long,
        company: String?,
    ) : this(name, phoneNumber) {
        this.company = company
    }

    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "не указано"}")
    }
}


fun main() {
    val firstContact = PhoneBookContact2("Philip", 5556565, "E-Corp")
    val secondContact = PhoneBookContact2("Jo", 5553333)

    firstContact.printContactInfo()
    println()

    secondContact.printContactInfo()
    println()
}
