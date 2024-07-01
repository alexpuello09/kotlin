
fun eatACake() = println("Eat A Cake")
fun bakeACake() = println("Bake A Cake")

fun main(args: Array<String>) {
    val fruits = listOf("Lemon", "Pineapple", "Pear", "Grape")
    for (fruit in fruits) {
        println("I have a $fruit")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5 ) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}