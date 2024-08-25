package org.example.lesson_20

fun main() {
    val itemsList: List<String> = listOf("поиск", "назад", "вперёд", "открыть")
    val lambdasList: List<() -> Unit> = itemsList.map { { println("Нажат элемент \"$it\"") } }

    for (i in 1..<lambdasList.size step 2) {
        lambdasList[i]()
    }
}
