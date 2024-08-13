package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
) {
    var bio: String = ""

    fun getUserInfo() {
        println(
            """
            Информация о пользователе
            
            id: $id
            login: $login
            password: $password
            mail: $mail
            
            bio: 
            - $bio
        """.trimIndent()
        )
    }

    fun fillBio() {
        println("Напишите немного о себе:")
        bio = readln()
    }

    fun changePassword() {
        print("Изменение пароля.\nВведите текущий пароль: ")
        val oldPassword = readln()
        if (oldPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменён")
        } else println("Неверный пароль")
    }
}


fun main() {

    val firstUser = User2(
        id = 1,
        login = "qwerty",
        password = "123456seven",
        mail = "qwerty@gggmail.com"
    )

    firstUser.fillBio()
    println()
    firstUser.changePassword()
    println()
    firstUser.getUserInfo()
}