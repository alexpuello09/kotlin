fun main() {
    println(arrayOfMinusOnes(10).contentToString())
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}