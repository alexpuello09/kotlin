fun main() {
    val cadena: String = "TestCadena"
    println(cadena.printFirstLetter())
    println(cadena.printLastLetter())
}

fun String.printFirstLetter(): Char {
    return this[0]
}

fun String.printLastLetter(): Char {
    return this.last()
}