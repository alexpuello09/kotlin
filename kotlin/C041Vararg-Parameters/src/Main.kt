fun main() {
    greetings("Hello", "Salut", "Hola")
}

fun greetings(vararg greetingsList: String): Unit{
    for (s in greetingsList) {
        println(s)
    }
}