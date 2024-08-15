package org.example.lesson_13


class PhoneBookContact5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "не указано"}")
    }
}


fun main() {
    val phoneNumber = enterPhoneNumber1()
    if (phoneNumber != -1L) println(phoneNumber)
}


fun enterPhoneNumber1(): Long {
    print("- Номер телефона: ")

    try {
        return readln().toLong()
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
        return -1
    }
}
