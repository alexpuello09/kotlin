fun main(){
    val words = listOf("oo","fes", "bar", "baz", "fazf")
    val empty = emptyList<String>()

    val first = empty.firstOrNull()
    val last = empty.lastOrNull()

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.lastOrNull() { it.startsWith('z') }
    val lastF = words.lastOrNull { it.endsWith('f') }

    // These functions return null if there are no matching elements.

    println(first)
    println(last)
    println(firstF)
    println(firstZ)
    println(lastF)
}