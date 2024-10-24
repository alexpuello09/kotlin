fun main() {
    val multipleObject = MultipleValues<String>("Pear", "apple", "grape", "Lemon")
    val multipleObject1 = MultipleValues("teacher", 1, 10.3, true)
    val multipleObject2 = MultipleValues(50, false, 20.1)

    multipleObject.printElements()
    println()
    multipleObject1.printElements()
    println()
    multipleObject2.printElements()

    println()
   multipleValues<Int>(1,2,3,4,5)
    println()
   multipleValues<String>("Hello", "Salut", "Hola")

}

class MultipleValues<E>(vararg values: E) {
    private val elements = values.toList()

    fun printElements() {
        for (element in elements) {
            when (element) {
                is String -> println("Is string")
                is Int -> println("Is Int")
                else -> {
                    println("Another value")
                }
            }
        }
    }
}


fun <E> multipleValues(vararg elements: E ): Unit{
    val result = elements.toList()
    for (item in result) {
        println(item)
    }
}
