fun main() {
    printProduct("Alex", "Puello")
}

fun parseInt(x: String ): Int? {
    return x.toIntOrNull()
}

fun printProduct(arg: String, arg2: String): Unit {
    val a = parseInt(arg)
    val b = parseInt(arg2)

    if (a != null && b != null) {
        println(a * b)
    } else {
        println("$arg or $arg2 is not a number")
    }
}