fun main() {
    cases(1)
    cases("Hello")
    cases(1.3)
    println()
    println(whenAssign(1))
    println(whenAssign("Salut"))
    println(whenAssign(3.5))
}

fun cases(obj: Any): Unit{
    return when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        !is String -> println("Is no String")
        else -> {
            println("Unknown value")
        }
    }
}

fun whenAssign(obj: Any): Any {
    val result = when(obj){
    1 -> "One"
    "Salut" -> "Hello in french"
    !is String -> "Is no String"
    else -> {
        "Unknown value"
    }
    }
return result
}