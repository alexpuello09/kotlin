fun main() {
    val name: String by lazy {
        println("Initializing variable")
        "Jesus"
    }

    println(name)
    println("And after the variable initialization")
    println(name)
}