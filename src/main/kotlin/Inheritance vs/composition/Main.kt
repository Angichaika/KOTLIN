package Esercizio1.`Inheritance vs`.composition
open class Parent {
    private var parentName = "Luca"
    private var parentAge = 26

    open fun printVariables() {
        println("Parent name: $parentName")
        println("Parent age: $parentAge")
    }
}

interface Hair {
    fun hairColor()
}

class Child1 : Parent() {
    private var childName = "Roxana"
    private var childAge = 8

    override fun printVariables() {
        println("Child name: $childName")
        println("Child age: $childAge")
    }
}

class Child2 : Hair {
    private val childHairColor = "Blonde"

    override fun hairColor() {
        println("Child hair color: $childHairColor")
    }
}

fun main() {
    val parent = Parent()
    parent.printVariables()

    val child1 = Child1()
    child1.printVariables()

    val child2 = Child2()
    child2.hairColor()
}
