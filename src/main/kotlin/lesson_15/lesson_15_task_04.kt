package org.example.lesson_15


interface ProductSearch {
    fun searchProduct(component: Product)
}


abstract class Product(
    val name: String,
    val number: Int,
)


class MusicalInstrumentComponent(
    name: String,
    number: Int,
) : Product(name, number)


class MusicalInstrument(
    name: String,
    number: Int,
) : Product(name, number), ProductSearch {

    private val numberOfInstr = number
    private val instrumentName = name

    override fun searchProduct(component: Product) {

        println("Выполняется поиск\n")
        println("Для инструмента \"$instrumentName\" выполняется поиск компонента \"${component.name}\"")

        if (component.number >= numberOfInstr)
            println("Найдены компоненты для всех инструментов")
        else {
            val result = numberOfInstr - component.number

            println("Не найдены компоненты для инструментов в количестве $result шт.")
        }
    }
}


fun main() {

    val component1 = MusicalInstrumentComponent("смычок", 5)
    val instrument1 = MusicalInstrument("скрипка", 8)

    val component2 = MusicalInstrumentComponent("чехол", 9)
    val instrument2 = MusicalInstrument("гитара", 8)

    instrument1.searchProduct(component1)
    println()
    instrument2.searchProduct(component2)
}
