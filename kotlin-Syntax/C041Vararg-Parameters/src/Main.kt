fun main() {
    greetings("Hello", "Salut", "Hola","Ciao","こんにちは", "你好")
}

fun greetings(vararg greetingsList: String): Unit{
    for (s in greetingsList) {
        println(s)
    }
}