package Esercizio1.`Using extension methods`

fun List<Int>.filterByValue(value: Int): List<Int> {
    return this.filter { it < value }
}

fun List<Int>.printListValues() {
    this.forEach { println(it) }
}

fun main() {
    val ListOfnumbers = listOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)

    val filteredNumbers = ListOfnumbers.filterByValue(500)
    filteredNumbers.printListValues()
}
