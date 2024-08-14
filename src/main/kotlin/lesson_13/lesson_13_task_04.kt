package org.example.lesson_13


class PhoneBookContact4(
    val name: String,
    val phoneNumber: Long,
) {
    private var company: String? = null

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


val contactsList: MutableList<PhoneBookContact4> = mutableListOf()
var count = 1
val answer = listOf("да", "д", "lf", "l")


fun main() {
    while (true) {
        println("\nКонтакт № $count:")

        val name = enterName()
        val phoneNumber = enterPhoneNumber() ?: if (createNewContact() in answer) continue else break
        val company = enterCompany()

        addContactToList(name = name, phoneNumber = phoneNumber, company = company)
        count++
        if (createNewContact() in answer) continue else break
    }

    for (i in contactsList.indices) {
        println("\nКонтакт № ${i + 1}:")
        contactsList[i].printContactInfo()
    }
}


fun enterName(): String {
    print("- Имя: ")
    return readln()
}


fun enterPhoneNumber(): Long? {
    print("- Номер телефона: ")
    val phoneNumber = readln().toLongOrNull()
    if (phoneNumber == null) {
        println("Вы не ввели номер телефона, контакт не будет добавлен")
        return null
    }
    return phoneNumber
}


fun enterCompany(): String? {
    print("- Компания: ")
    return readlnOrNull()
}


fun addContactToList(name: String, phoneNumber: Long, company: String?) {
    if (company?.trim()?.isEmpty() == true)
        contactsList.add(PhoneBookContact4(name = name.trim(), phoneNumber = phoneNumber))
    else
        contactsList.add(PhoneBookContact4(name = name.trim(), phoneNumber = phoneNumber, company = company?.trim()))
}


fun createNewContact(): String {
    print("\nСоздать новый контакт? (да / нет) ")
    return readln().lowercase()
}
