package org.example.lesson_19

enum class TypesOfProjectile(
    val id: Int,
    val type: String,
    val attackPower: Int
) {
    BLUE_PROJECTILE( 1, "Синий", 5),
    GREEN_PROJECTILE(2, "Зелёный", 10),
    RED_PROJECTILE(3, "Красный", 20),
}

class Tank {
    private val projectileList: MutableList<TypesOfProjectile> = mutableListOf()

    init {
        println("\nВы в танке. У вас пока нет снарядов")
    }

    // варианты выбора
    fun choices(): Int {
        do {
            when (val number = readln()) {
                "0", "1", "2", "3" -> return number.toInt()
                else -> print("Повторите ввод (0, 1, 2, 3): ")
            }
        } while (true)
    }

    // выбор действия
    fun chooseAction() {
        print("""
            
            Выберите действие:
            1 - подобрать снаряд;
            2 - зарядить пушку;
            3 - выстрелить;
            0 - покинуть танк
            Твой выбор: 
        """.trimIndent())
    }

    // выбор типа подбираемого снаряда
    fun chooseTypeOfProjectile() {
        print("""
            
            Какой снаряд хотите подобрать?
            1 - синий;
            2 - зелёный;
            3 - красный;
            0 - главное меню
            Твой выбор: 
        """.trimIndent())
    }

    // добавить подобранный снаряд в список
    fun addProjectileToList(number: Int) {
        for (value in TypesOfProjectile.entries) {
            if (value.id == number) {
                projectileList.add(value)
                println("\nВы подобрали ${value.type} тип снаряда.")
                break
            }
        }
    }

    // проверить наличие снарядов
    fun checkProjectileList() = projectileList.isEmpty()

    // выбор типа заряжаемого снаряда
    fun chooseTypeOfProjectileToLoad() {
        print("""
            
            Какой снаряд хотите использовать?
            1 - синий;
            2 - зелёный;
            3 - красный;
            0 - главное меню
            Твой выбор: 
        """.trimIndent())
    }

    // проверка наличия типа снаряда
    fun checkProjectile(number: Int): TypesOfProjectile? {
        if (number == 0)
            return null
        for (value in projectileList) {
            if (value.id == number) {
                println("\nВы выбрали ${value.type} тип снаряда.")
                return value
            }
        }
        print("\nТакого снаряда нет в наличии\n")
        return null
    }

    // зарядить пушку
    fun load(projectile: TypesOfProjectile) {
        projectileList.remove(projectile)
        println("Пушка заряжена")
    }

    // выстрелить
    fun shoot(isLoaded: Boolean = false, typeOfProjectile: TypesOfProjectile?) {
        if (isLoaded) {
            println("\nПроизведён выстрел!")
            if (typeOfProjectile != null) {
                println("Нанесённый урон = ${typeOfProjectile.attackPower}")
            }
        } else
            println("\nПушка не заряжена")
    }
}

fun main() {
    val tank = Tank()
    var isLoaded = false
    var currentProjectile: TypesOfProjectile? = null

    while (true) {
        tank.chooseAction()
        val choice = tank.choices()
        when (choice) {
            0 -> {
                println("\nВы покинули танк")
                return
            }
            1 -> {
                tank.chooseTypeOfProjectile()
                val typeOfProjectile = tank.choices()
                tank.addProjectileToList(typeOfProjectile)
                continue
            }
            2 -> {
                if (isLoaded) {
                    println("\nПушка уже заряжена")
                    continue
                }
                if (tank.checkProjectileList()) {
                    println("\nУ вас нет снарядов")
                    continue
                }
                tank.chooseTypeOfProjectileToLoad()
                val projectileToLoad = tank.choices()
                currentProjectile = tank.checkProjectile(projectileToLoad) ?: continue
                tank.load(currentProjectile)
                isLoaded = true
            }
            3 -> {
                tank.shoot(isLoaded, currentProjectile)
                isLoaded = false
            }
        }
    }
}
