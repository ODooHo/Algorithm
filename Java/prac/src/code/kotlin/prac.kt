package code.kotlin

import java.io.File



data class Person(
    val name : String? = null,
    val age : Int
)




fun main(args: Array<String>) {
    val people = listOf(
        Person("Alice",29),
        Person("Bob",31),
        Person("Ted",40),
        Person("BABA",39),
        Person("Hello",31),
    )

    val temp = people.filter { it.age>30 }
    println(people.map { it.age > 30 })
    temp.forEach{it.name}
}
