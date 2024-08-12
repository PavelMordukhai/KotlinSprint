package org.example.lesson_10

const val LOGIN = "myName"
const val PASSWORD = "123456seven"
const val TOKEN_LENGTH = 32


fun main() {

    val token = verifyCredentials(LOGIN, PASSWORD)

    if (token == null) {
        println("Неверное имя пользователя или пароль")
        return
    }

    val listOfGoods = getListOfGoods(token)

    println("\nСписок товаров в корзине:")
    println("- ${listOfGoods.joinToString("\n- ")}")
}


// Верификация пользователя
fun verifyCredentials(login: String, password: String): String? {

    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPass = readln()

    if ((userLogin != login) || (userPass != password))
        return null

    return getToken(TOKEN_LENGTH)
}


// Генерация токена
fun getToken(tokenLength: Int): String {

    val numbers = '0'..'9'
    val lowerCase = 'a'..'z'
    val upperCase = 'A'..'Z'

    val symbolTypesArr = arrayOf(numbers, lowerCase, upperCase)
    val symbols = symbolTypesArr.toMutableList()
    val symbolTypesCount = symbolTypesArr.size

    var token = ""
    var symbol = ""

    for (i in 1..(tokenLength - symbolTypesCount)) {
        val symbolType = symbolTypesArr.random()
        symbols.add(symbolType)
    }
    symbols.shuffle()

    for (i in symbols) {
        symbol = i.random().toString()
        token += symbol
    }

    return token
}


// Вывод списка товаров
fun getListOfGoods(token: String): List<String> {
    val listOfGoods = listOf("Pen", "Pencil", "Eraser")
    return listOfGoods
}

