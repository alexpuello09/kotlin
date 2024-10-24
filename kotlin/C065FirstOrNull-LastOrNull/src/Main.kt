fun main(){
    val words = listOf("oo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val first = empty.firstOrNull()
    val last = empty.lastOrNull()

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.lastOrNull() { it.startsWith('z') }
    // These functions return null if there are no matching elements.

    println(first)
    println(last)
    println(firstF)
    println(firstZ)
}