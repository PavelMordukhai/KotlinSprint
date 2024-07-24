package org.example.lesson_02

fun main() {
    /*

    Задача 2 к Уроку 2

    В компании работало 50 человек с зарплатой по 30000 рублей.
    Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
    Пишем часть гипотетического софта для бухгалтерии, который будет считать:

    – Расходы на выплату зарплаты постоянных сотрудников;
    – Общие расходы по ЗП после прихода стажеров;
    – Среднюю ЗП одного сотрудника после устройства стажеров.

    Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
    Все значения необходимо вывести в виде целых чисел.
     */

    val numberOfEmployees = 50
    val numberOfInterns = 30

    val salaryOfEmployee = 30000
    val salaryOfIntern = 20000

    // Расходы на выплату зарплаты постоянных сотрудников
    val employeesSalaryCosts = numberOfEmployees * salaryOfEmployee

    // Общие расходы по ЗП после прихода стажеров
    val totalSalaryCosts = employeesSalaryCosts + (numberOfInterns * salaryOfIntern)

    // Среднюю ЗП одного сотрудника после устройства стажеров
    val averageSalary = (totalSalaryCosts) / (numberOfEmployees + numberOfInterns)

    println(employeesSalaryCosts)
    println(totalSalaryCosts)
    println(averageSalary)
}