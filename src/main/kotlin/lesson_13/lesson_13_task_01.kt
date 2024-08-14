package org.example.lesson_13


class PhoneBookContact(
    val name: String,
    val phoneNumber: Long,
) {
    constructor(
        name: String,
        phoneNumber: Long,
        company: String?,
    ) : this(name, phoneNumber)
}
