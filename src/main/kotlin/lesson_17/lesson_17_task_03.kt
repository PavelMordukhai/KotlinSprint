package org.example.lesson_17


class Folder(
    name: String,
    numberOfFiles: Int = 0,
    private var hiddenFolder: Boolean = false,
) {
    var name = name
        get() {
            if (hiddenFolder)
                return "скрытая папка"
            return field
        }

    var numberOfFiles = numberOfFiles
        get() {
            if (hiddenFolder)
                return 0
            return field
        }
}


fun main() {

    val folder1 = Folder("documents", 50, true)
    println(folder1.name)
    println(folder1.numberOfFiles)
}


