package org.example.lesson_13


class PhoneBookContact3(
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
    val contactsList: MutableList<PhoneBookContact3> = mutableListOf()
    val companyList: MutableList<String?> = mutableListOf()

    contactsList.add(PhoneBookContact3("Philip", 5556565, "E-Corp"))
    contactsList.add(PhoneBookContact3("Stephen", 5557777, "Castle Rock"))
    contactsList.add(PhoneBookContact3("Jo", 5552222))
    contactsList.add(PhoneBookContact3("Jane", 5551111))
    contactsList.add(PhoneBookContact3("Zero", 5550000, "null"))

    for (item in contactsList)
        companyList.add(item.company ?: continue)

    println("Список компаний в телефонной книге:")
    for (i in companyList) println("- $i")
}
