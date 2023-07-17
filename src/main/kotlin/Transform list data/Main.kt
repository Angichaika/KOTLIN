package Esercizio1.Esercizio_3
fun main() {
    val listOfNumbers = listOf(1,5,10,15,20)

    listOfNumbers.map{it -> it.toString()}.forEach{it -> println("$it")}
}