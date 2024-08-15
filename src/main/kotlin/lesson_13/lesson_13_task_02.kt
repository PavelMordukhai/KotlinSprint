package org.example.lesson_13


class PhoneBookContact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

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
