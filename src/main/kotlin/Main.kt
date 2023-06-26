package Esercizio1

fun main(args: Array<String>) {
    for (i in 1..100 step 2) {
        when (i) {
            in 1..50 -> above50(i)
            in 50..100 -> below50(i)
        }
    }


}

fun above50(i: Int) {
    println("numeri sotto 50: $i")
}
fun below50(i: Int){
    println("numeri sopra 50: $i")
}